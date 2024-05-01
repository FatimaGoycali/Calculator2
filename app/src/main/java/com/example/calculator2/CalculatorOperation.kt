package com.example.calculator2

sealed class CalculatorOperation(var symbol: String) {

    object Add : CalculatorOperation("+")
    object Subtract : CalculatorOperation("-")
    object Multiply : CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
    object None:CalculatorOperation("")

}