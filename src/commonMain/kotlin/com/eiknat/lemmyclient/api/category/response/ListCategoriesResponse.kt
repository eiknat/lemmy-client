package com.eiknat.lemmyclient.api.category.response

import com.eiknat.lemmyclient.api.category.model.Category
import kotlinx.serialization.Serializable

@Serializable
data class ListCategoriesResponse(val categories: List<Category>)
