package com.socialite.pos_mvp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.socialite.pos_mvp.data.local.dao.ProductDao
import com.socialite.pos_mvp.data.local.entity.ProductEntity

@Database(
    entities = [ProductEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao

    companion object {
        const val DATABASE_NAME = "pos_product_db"
    }
}
