package ru.netology

fun main() {
    val amount = 470_000
    val minimumCommission = 3_500
    val commission = (amount * 0.75 / 100).toInt()
    val result = if (commission > minimumCommission) commission else minimumCommission
    println("Комиссия с вашего платежа составляет: $result коп.")
}
