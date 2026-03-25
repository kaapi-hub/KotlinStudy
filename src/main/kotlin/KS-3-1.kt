import java.time.LocalTime
// делаем приветствие пользователя в зависимости от времени
fun main() {
    val userName = "Повелитель"
    val currentTime = LocalTime.now()
    val greeting = when {
        currentTime in LocalTime.of(4, 0)..LocalTime.of(9, 59) -> "Доброе утро"
        currentTime in LocalTime.of(10, 0)..LocalTime.of(16, 59) -> "Добрый день"
        currentTime in LocalTime.of(17, 0)..LocalTime.of(21, 59) -> "Добрый вечер"
        else -> "Доброй ночи"
    }
    println("$greeting, $userName!")

    // более простое решение
    var hello = "Приветствую"
    println("$hello, $userName")
    hello = "Здрав будь"
    println("$hello, $userName")
}
