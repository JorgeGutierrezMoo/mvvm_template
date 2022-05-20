package com.jgutierrez.room.domain

import com.jgutierrez.room.data.QuoteRepository
import com.jgutierrez.room.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository : QuoteRepository
) {

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()
    //Esta línea es lo mismo que las líneas de abajo.
    /*suspend operator fun invoke():List<QuoteModel>?{
        return repository.getAllQuotes()
    }*/

}