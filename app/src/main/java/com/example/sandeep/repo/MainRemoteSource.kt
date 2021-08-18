package com.example.sandeep.repo

import android.util.Log
import com.example.core.di.FormattedResponse
import com.example.core.util.Resource
import com.example.sandeep.Person
import com.google.firebase.firestore.*
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Sandeep Sankla
 */
class MainRemoteSource @Inject constructor(val formattedResponse: FormattedResponse)   {

    fun addNewUser(name: String, city: String): Flow<Resource<Person>> = flow{

       try{
           emit(Resource.Loading(true))
           val user = Person(System.currentTimeMillis().toString(),  name, city)
           val sasa = Firebase.firestore
           sasa.collection("userList").document(user.id!!)
           .set(user)
           emit(Resource.Success(user))
       }catch (e:Exception){
           e.message?.let { Log.e("sasa", it) }
       }
    }

    @ExperimentalCoroutinesApi
    fun getPersonList() :Flow<Resource<Person>> = channelFlow {
        channel.offer(Resource.Loading(true))
        val mFireStore = FirebaseFirestore.getInstance()
        val collectionReference: CollectionReference? = mFireStore.collection("userList")
        val subscription = collectionReference?.addSnapshotListener(){ querySnapshot: QuerySnapshot?, firebaseFirestoreException: FirebaseFirestoreException? ->
            try {
                if (firebaseFirestoreException != null) {
                    return@addSnapshotListener
                }
                //var list = arrayListOf<Person>()
                if (querySnapshot != null && !querySnapshot.isEmpty) {
                    val documents = querySnapshot.documents
                    if (documents.isNotEmpty()) {
                        CoroutineScope(Dispatchers.IO).launch {
                            for (item in querySnapshot.documentChanges) {
                                when (item.type) {
                                    DocumentChange.Type.ADDED -> {
                                        val person = item.document.toObject(Person::class.java)
                                        channel.offer(Resource.Success(person))

                                    }
                                    DocumentChange.Type.REMOVED -> {

                                    }
                                    DocumentChange.Type.MODIFIED -> {

                                    }
                                }
                                //channel.offer(Resource.Success(list))
                            }
                        }
                    }else{

                    }
                }else{

                }

                }catch (e:Exception){}
        }
        awaitClose{subscription?.remove()}

    }


}