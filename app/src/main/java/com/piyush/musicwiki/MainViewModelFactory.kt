package com.piyush.musicwiki

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.piyush.musicwiki.repository.Repository
import com.piyush.musicwiki.viewmodel.MainViewModel

class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}