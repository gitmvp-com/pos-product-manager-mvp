package com.socialite.pos_mvp.data.repository

import com.socialite.pos_mvp.data.local.dao.ProductDao
import com.socialite.pos_mvp.data.local.entity.ProductEntity
import com.socialite.pos_mvp.domain.model.Product
import com.socialite.pos_mvp.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productDao: ProductDao
) : ProductRepository {

    override fun getAllProducts(): Flow<List<Product>> {
        return productDao.getAllProducts().map { entities ->
            entities.map { it.toDomain() }
        }
    }

    override suspend fun getProductById(id: Long): Product? {
        return productDao.getProductById(id)?.toDomain()
    }

    override suspend fun insertProduct(product: Product): Long {
        return productDao.insertProduct(ProductEntity.fromDomain(product))
    }

    override suspend fun updateProduct(product: Product) {
        productDao.updateProduct(ProductEntity.fromDomain(product))
    }

    override suspend fun deleteProduct(product: Product) {
        productDao.deleteProduct(ProductEntity.fromDomain(product))
    }

    override suspend fun deleteProductById(id: Long) {
        productDao.deleteProductById(id)
    }
}
