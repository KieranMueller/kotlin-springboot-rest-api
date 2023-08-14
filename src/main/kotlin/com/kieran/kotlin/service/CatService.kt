package com.kieran.kotlin.service

import com.kieran.kotlin.model.Cat

interface CatService {

    fun getAllCats(): List<Cat>

    fun getCatById(id: Long): Cat

    fun postCat(cat: Cat): Cat

    fun updateCat(id: Long, cat: Cat): Cat

    fun deleteCatById(id: Long): Cat

}