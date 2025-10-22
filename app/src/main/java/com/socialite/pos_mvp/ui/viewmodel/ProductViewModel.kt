package com.socialite.pos_mvp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.socialite.pos_mvp.domain.model.Product
import com.socialite.pos_mvp.domain.usecase.DeleteProductUseCase
import com.socialite.pos_mvp.domain.usecase.GetAllProductsUseCase
import com.socialite.pos_mvp.domain.usecase.InsertProductUseCase
import com.socialite.pos_mvp.domain.usecase.UpdateProductUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val getAllProductsUseCase: GetAllProductsUseCase,
    private val insertProductUseCase: InsertProductUseCase,
    private val updateProductUseCase: UpdateProductUseCase,
    private val deleteProductUseCase: DeleteProductUseCase
) : ViewModel() {

    val products: StateFlow<List<Product>> = getAllProductsUseCase()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun insertProduct(product: Product) {
        viewModelScope.launch {
            insertProductUseCase(product)
        }
    }

    fun updateProduct(product: Product) {
        viewModelScope.launch {
            updateProductUseCase(product)
        }
    }

    fun deleteProduct(productId: Long) {
        viewModelScope.launch {
            deleteProductUseCase(productId)
        }
    }
}
