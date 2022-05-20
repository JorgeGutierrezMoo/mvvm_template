package com.jgutierrez.room.data.network

import com.jgutierrez.room.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET("/.json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>

}