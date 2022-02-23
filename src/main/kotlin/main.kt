package ru.netology

fun main() {
    val amount = 100_000
    val minimumPercentage = 3_500

    if (amount > minimumPercentage) {
        val commission = (amount * 0.75 / 100).toInt()
        println("Комиссия с вашего платежа составляет: $commission коп.")
    } else {
        println(
            "Минимальный размер комисси составляет 35 руб.\nСумма перевода слишком маленькая!!!")
    }
}