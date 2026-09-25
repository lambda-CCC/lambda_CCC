package com.example.lambda_ccc

class Rectangle(
    x: Int,
    y: Int,
    val width: Int,
    val height: Int,

) : Shape(x, y) {

    fun area(): Int = width * height
}
