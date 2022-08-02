package com.gabo.jsonparse

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gabo.jsonparse.model.Item
import com.gabo.jsonparse.service.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainVM : ViewModel() {
    val viewState: MutableLiveData<ViewState> = MutableLiveData()

    private fun currentViewState(): ViewState = viewState.value!!

    init {
        viewState.value = ViewState()
        getData()
    }

    private fun getData() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = RetrofitInstance.getService().getItem()
            if (response.isSuccessful) {
                viewState.postValue(
                    currentViewState().copy(
                        isSuccessful = true,
                        itemData = response.body()
                    )
                )
            } else {
                viewState.postValue(
                    currentViewState().copy(
                        isSuccessful = true,
                        error = response.errorBody().toString()
                    )
                )
            }
        }
    }

    data class ViewState(
        val itemData: Item? = null,
        val error: String? = null,
        val isSuccessful: Boolean? = null
    )
}