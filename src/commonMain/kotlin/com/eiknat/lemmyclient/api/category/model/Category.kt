package com.eiknat.lemmyclient.api.category.model

import kotlinx.serialization.Serializable

@Serializable
data class Category(val id: Int, val name: String)
