fun main(){
    val minCommission: Int = 3500 //минимальная коммисии в копейках
    val percentCommission: Float = 0.75f // процент коммисии
    val amount: Int = 500000 //сумма перевода в копейках
    var result = (amount / 100) * percentCommission // формула расчета процентов
    // для объявления переменной result используем var так как далее значение переменной может быть изменено
    if (result < minCommission){ // проверяем, если коммисия меньше минимальной,
        result = minCommission.toFloat() // то устанавливаем размер коммисии равный минимальному
    }
    println(result / 100) // выводим размер коммисии в рублях
}