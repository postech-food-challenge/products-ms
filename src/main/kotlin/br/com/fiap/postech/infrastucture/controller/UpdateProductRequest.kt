package br.com.fiap.postech.infrastucture.controller

import kotlinx.serialization.Serializable

@Serializable
data class UpdateProductRequest(
    val name: String,
    val description: String,
    val image: String,
    val price: Int,
    val category: String
)