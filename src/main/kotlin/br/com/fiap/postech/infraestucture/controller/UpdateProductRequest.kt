package br.com.fiap.postech.infraestucture.controller

data class UpdateProductRequest(
    val name: String,
    val description: String,
    val image: String,
    val price: Int,
    val category: String
)
