package com.kieran.kotlin.controller

import com.kieran.kotlin.model.Cat
import com.kieran.kotlin.service.CatService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/cats")
class CatController(private val catService: CatService) {

    @GetMapping
    fun getAllCats(): List<Cat> = catService.getAllCats()

    @GetMapping("{id}")
    fun getCatById(@PathVariable id: Long): Cat = catService.getCatById(id)

    @PostMapping
    fun postCat(@RequestBody cat: Cat): Cat = catService.postCat(cat)

    @PutMapping("{id}")
    fun updateCat(@PathVariable id: Long, @RequestBody cat: Cat): Cat = catService.updateCat(id, cat)

    @DeleteMapping("{id}")
    fun deleteCatById(@PathVariable id: Long): Cat = catService.deleteCatById(id)
}