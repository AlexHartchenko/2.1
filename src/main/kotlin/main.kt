package ru.netology

fun main() {
    val amount = 470_000
    val minimumCommission = 3_500
    val commission = (amount * 0.75 / 100).toInt()
    if (commission >= minimumCommission) {
        println("Комиссия с вашего платежа составляет: $commission коп.")
    } else if (amount <= minimumCommission) {
        println("Сумма платежа слишком маленькая! Недостаточно средств, для взымания комиссии!")
    } else {
        println("Комиссия 35руб")
    }
}
