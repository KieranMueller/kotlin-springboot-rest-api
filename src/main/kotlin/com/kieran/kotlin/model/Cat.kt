package com.kieran.kotlin.model

import jakarta.persistence.*

@Entity
data class Cat(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(nullable = false)
    var name: String,
    @Column(nullable = false)
    var color: String,
    @Column(nullable = false)
    var weight: Double? = null,
    @Column(nullable = false)
    var isMale: Boolean? = null
) {
}