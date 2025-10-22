package com.socialite.pos_mvp.domain.usecase

import com.socialite.pos_mvp.domain.repository.ProductRepository
import javax.inject.Inject

class DeleteProductUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    suspend operator fun invoke(productId: Long) {
        repository.deleteProductById(productId)
    }
}
