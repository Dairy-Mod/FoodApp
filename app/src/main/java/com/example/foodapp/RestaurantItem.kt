package com.example.foodapp

data class RestaurantItem(
    val title: String,
    val imageRes: Int
)

val restaurantes = listOf(
    RestaurantItem("Burger King", R.drawable.burger),
    RestaurantItem("McDonald's", R.drawable.macmac),
    RestaurantItem("KFC", R.drawable.pollito),
    RestaurantItem("Dominos", R.drawable.logo_dominos),
    RestaurantItem("Starbucks", R.drawable.coffe),
)
