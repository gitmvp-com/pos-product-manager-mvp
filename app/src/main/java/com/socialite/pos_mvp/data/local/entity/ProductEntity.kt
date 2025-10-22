package com.socialite.pos_mvp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.socialite.pos_mvp.domain.model.Product

@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val price: Double,
    val stock: Int,
    val createdAt: Long = System.currentTimeMillis()
) {
    fun toDomain(): Product {
        return Product(
            id = id,
            name = name,
            price = price,
            stock = stock
        )
    }

    companion object {
        fun fromDomain(product: Product): ProductEntity {
            return ProductEntity(
                id = product.id,
                name = product.name,
                price = product.price,
                stock = product.stock
            )
        }
    }
}
