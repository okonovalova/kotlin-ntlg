import kotlin.math.roundToInt

fun main() {
    val isRegularCustomer = true                        //признак постоянного покупателя
    val prevAmount = 1_000.00                           //сумма предыдущей покупки в рублях
    val currentAmount = 1037.00                         //сумма текущей покупки в рублях
    val conversionToKopecks = 100.00                    //константа для конвертации рублей в копейки
    val standardDiscount = 100.00 * conversionToKopecks //стандартная скидка 100 р
    val discountPercentage = 0.05                       //процент скидки 5%, если предыдущая сумма от 10 001 рубля
    val discountPercentageForRegular = 0.01             //процент скидки 1% для постоянного покупателя

    val currentPurchaseAmountInKopecks = currentAmount * conversionToKopecks

    val result = if (prevAmount > 1_000 && prevAmount <= 10_000) {
        currentPurchaseAmountInKopecks - standardDiscount
    } else if (prevAmount > 10_000) {
        currentPurchaseAmountInKopecks * (1 - discountPercentage)
    } else {
        currentPurchaseAmountInKopecks
    }
    if (isRegularCustomer) {
        val resultForRegular = result * (1 - discountPercentageForRegular)
        println(resultForRegular.roundToInt() / conversionToKopecks)
    } else {
        println(result.roundToInt() / conversionToKopecks)
    }
}