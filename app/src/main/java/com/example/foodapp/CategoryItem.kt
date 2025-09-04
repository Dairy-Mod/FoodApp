package com.example.foodapp

data class CategoryItem(
    val title: String,
    val imageRes: Int
)

val categorias = listOf(
    CategoryItem("Fast Food", R.drawable.fastfood),
    CategoryItem("Chinese", R.drawable.fideo),
    CategoryItem("Italian", R.drawable.italian),
    CategoryItem("Local", R.drawable.local),
    CategoryItem("Más", R.drawable.mas)
)