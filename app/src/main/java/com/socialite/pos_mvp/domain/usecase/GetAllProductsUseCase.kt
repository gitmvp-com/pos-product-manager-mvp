package com.socialite.pos_mvp.domain.usecase

import com.socialite.pos_mvp.domain.model.Product
import com.socialite.pos_mvp.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllProductsUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    operator fun invoke(): Flow<List<Product>> {
        return repository.getAllProducts()
    }
}
