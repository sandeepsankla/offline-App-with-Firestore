package com.example.sandeep.ui

import androidx.lifecycle.*
import com.example.core.base.BaseViewModel
import com.example.core.util.Resource
import com.example.sandeep.Person
import com.example.sandeep.repo.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel  @Inject constructor(private val repository : MainRepository): BaseViewModel() {

    private var _person = MutableLiveData<Resource<Person>>()
    val person: LiveData<Resource<Person>> = _person
    private var _listPerson = MutableLiveData<Resource<Person>>()
    val listPerson: LiveData<Resource<Person>> = _listPerson

    fun addPerson(name: String, city: String) {
        viewModelScope.launch {
            repository.addNewPerson(name, city).collect {
                _person.value = it
            }
        }
    }

    fun getPerson(){
        viewModelScope.launch {
            repository.getAllPerson().collect {
                _listPerson.value = it
            }
        }
    }
}