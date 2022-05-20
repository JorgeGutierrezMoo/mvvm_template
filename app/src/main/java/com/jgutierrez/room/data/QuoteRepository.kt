package com.jgutierrez.room.data

import com.jgutierrez.room.data.model.QuoteModel
import com.jgutierrez.room.data.model.QuoteProvider
import com.jgutierrez.room.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val api : QuoteService, private val quoteProvider: QuoteProvider) {

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }

}