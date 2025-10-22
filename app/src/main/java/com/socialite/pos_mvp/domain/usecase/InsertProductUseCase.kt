package com.socialite.pos_mvp.domain.usecase

import com.socialite.pos_mvp.domain.model.Product
import com.socialite.pos_mvp.domain.repository.ProductRepository
import javax.inject.Inject

class InsertProductUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    suspend operator fun invoke(product: Product): Long {
        return repository.insertProduct(product)
    }
}
