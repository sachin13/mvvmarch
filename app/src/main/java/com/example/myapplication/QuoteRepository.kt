package com.example.myapplication

import androidx.lifecycle.LiveData

class QuoteRepository(private val quoteDao:QuoteDao ) {

    fun getQuotes():LiveData<List<Quote>> {

        return quoteDao.getQuotes()
    }

     fun insertQuote(quote: Quote){
        quoteDao.insertQuote(quote)
    }
}