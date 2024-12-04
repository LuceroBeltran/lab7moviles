package com.example.lab07tarea

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Product (
    @PrimaryKey(autoGenerate = true) val pid: Int = 0,
    @ColumnInfo(name = "product_id") val productId: String?,
    @ColumnInfo(name = "product_name") val productName: String?,
    @ColumnInfo(name = "product_price") val productPrice: Double?,
    @ColumnInfo(name = "product_description") val productDescription: String?

)
