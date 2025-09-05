package com.example.foodapp

data class FoodItem(
    val title : String,
    val imageRes : Int
)

val comidas = listOf(
    FoodItem("4.7 Whopper",R.drawable.whopper),
    FoodItem("4.3 Tacos Buenos", R.drawable.taquito),
    FoodItem("4.9 McFlurry", R.drawable.mcflu),
    FoodItem("4.0 Chizza", R.drawable.chizza),
    FoodItem("3.5 Big Mac", R.drawable.bigmac)
)
