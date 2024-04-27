package com.group.libraryapp.caculator

class Calculator(var number: Int)  {
    fun add(operand: Int) {
        number += operand
    }

    fun minus(operand: Int) {
        number -= operand
    }

    fun multiply(operand: Int) {
        number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        number /= operand
    }
}