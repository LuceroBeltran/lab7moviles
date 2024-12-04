package com.example.lab07tarea


import android.util.Log

suspend fun getProducts(dao: ProductDao): String {
    var response: String = ""
    val products = dao.getAll()
    products.forEach { product ->
        response += "ID: ${product.pid} - Nombre: ${product.productName} - Descripción: ${product.productDescription}\n"
    }
    return response
}

suspend fun addProduct(product: Product, dao: ProductDao) {
    try {
        dao.insert(product)
    } catch (e: Exception) {
        Log.e("Product", "Error: insert: ${e.message}")
    }
}

suspend fun deleteLastProduct(dao: ProductDao) {
    val lastProduct = dao.getLastProduct()
    if (lastProduct != null) {
        dao.delete(lastProduct)
    }
}