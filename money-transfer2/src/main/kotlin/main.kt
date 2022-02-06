import kotlin.math.roundToInt

fun main() {
    val amount = 10_035
    val transferInterestRate = 0.75
    val conversionToPennies = 100.00
    val minTransferFee = 35 * conversionToPennies
    val result = if ((amount * transferInterestRate) <= minTransferFee) {
        minTransferFee
    } else {
        (amount * transferInterestRate).roundToInt()
    }
    println("Комиссия по переводу составит: $result копеек")
}