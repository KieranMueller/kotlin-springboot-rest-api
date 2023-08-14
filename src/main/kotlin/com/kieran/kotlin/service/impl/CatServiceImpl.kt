package com.kieran.kotlin.service.impl

import com.kieran.kotlin.model.Cat
import com.kieran.kotlin.repository.CatRepository
import com.kieran.kotlin.service.CatService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CatServiceImpl(private val catRepository: CatRepository) : CatService {

    override fun getAllCats(): List<Cat> =
        catRepository.findAll()

    override fun getCatById(id: Long): Cat {
        val cat: Optional<Cat> = catRepository.findById(id)
        if (cat.isPresent) return cat.get()
        throw RuntimeException()
    }

    override fun postCat(cat: Cat): Cat {
        return catRepository.save(cat)
    }

    override fun updateCat(id: Long, cat: Cat): Cat {
        val oldCat: Cat = catRepository.findById(id).orElseThrow()
        oldCat.name = cat.name
        oldCat.color = cat.color
        oldCat.weight = cat.weight
        oldCat.isMale = cat.isMale
        return catRepository.save(oldCat)
    }

    override fun deleteCatById(id: Long): Cat {
        val cat: Cat = catRepository.findById(id).orElseThrow()
        catRepository.deleteById(id)
        return cat
    }
}