package com.gabo.jsonparse.service

import com.gabo.jsonparse.model.Item
import retrofit2.Response
import retrofit2.http.GET

interface ItemService {
    @GET(END_POINT)
    suspend fun getItem(): Response<Item>

    companion object {
        const val END_POINT = "/v3/3588163c-a9c8-488c-af9a-534b392e7128"
    }
}