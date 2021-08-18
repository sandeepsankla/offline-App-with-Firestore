package com.example.sandeep.repo

import com.example.core.util.Resource
import com.example.sandeep.Person
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MainRepository @Inject constructor(private val mainRemoteSource: MainRemoteSource) :
    MainRepoSource {
    override fun addNewPerson(
        name: String,
        city: String
    ): Flow<Resource<Person>> = mainRemoteSource.addNewUser(name, city)

    @ExperimentalCoroutinesApi
    override fun getAllPerson():Flow<Resource<Person>> = mainRemoteSource.getPersonList()


}