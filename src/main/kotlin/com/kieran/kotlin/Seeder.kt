package com.kieran.kotlin

import com.kieran.kotlin.model.Cat
import com.kieran.kotlin.repository.CatRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class Seeder(private val catRepository: CatRepository) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val belfry = Cat(null, "Belfry", "Black", 12.4, true)
        val gaara = Cat(null, "Gaara", "Black", 13.1, true)
        val luna = Cat(null, "Luna", "Black", 10.8, false)
        catRepository.saveAll(listOf(belfry, gaara, luna))
    }
}