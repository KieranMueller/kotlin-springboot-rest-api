package com.kieran.kotlin.repository

import com.kieran.kotlin.model.Cat
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CatRepository : JpaRepository<Cat, Long> {
}