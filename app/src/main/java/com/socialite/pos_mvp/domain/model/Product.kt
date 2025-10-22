package com.socialite.pos_mvp.domain.model

data class Product(
    val id: Long = 0,
    val name: String,
    val price: Double,
    val stock: Int
)
