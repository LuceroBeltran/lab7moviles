package com.example.lab07tarea

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao {
    @Query("SELECT * FROM Product")
    suspend fun getAll(): List<Product>

    @Insert
    suspend fun insert(product: Product)

    @Update
    suspend fun update(product: Product)

    @Delete
    suspend fun delete(product: Product)

    // Obtener el último producto añadido
    @Query("SELECT * FROM Product ORDER BY pid DESC LIMIT 1")
    suspend fun getLastProduct(): Product?
}