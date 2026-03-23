fun main() {
    // Используем наименьшие подходящие типы
    val length: Long = 40868600000          // Long, т.к. превышает Int
    val age: Byte = 27                         // Byte (до 127)
    val partOfDay: Float = 0.075f              // Float (занимает 4 байта)
    val seconds: Short = 6480                  // Short (до 32767)
    val partOfYear: Float = 2.0547945205479453E-4f  // Float (4 байта)
    val apogee: Int = 327000                   // Int (до ~2 млрд)

    // Выводим каждую переменную с новой строки
    println(length)
    println(age)
    println(partOfDay)
    println(seconds)
    println(partOfYear)
    println(apogee)
}