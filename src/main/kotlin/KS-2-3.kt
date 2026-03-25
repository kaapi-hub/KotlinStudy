fun main(){
    val startTimeHour = 9
    val startTimeMinute = 39
    val tripTime = 457

    val tripTimeHour = tripTime / 60 // считаем количество часов в дороге
    val tripTimeMinute = tripTime % 60 // считаем остатки минут
    println("$tripTimeHour:$tripTimeMinute")

    // считаем общее время в дороге
    var arrivingHour = startTimeHour + tripTimeHour
    var arrivingMinute = startTimeMinute + tripTimeMinute
    println(String.format("%02d:%02d",arrivingHour, arrivingMinute))

    // Days without timezone issue: -1 =)
    // получаем время в дороге 7 ч, 37мин., что в итоге даст время как 16:76
    // то есть надо учесть что при превышении счетчика минут больше 60, надо добавить час
    if (arrivingMinute >= 60){
        arrivingHour = arrivingHour + 1
        arrivingMinute = arrivingMinute - 60
    println("$arrivingHour:$arrivingMinute")}
    // еще не разобрался с этими форматами, поэтому просто приучаюсь к паттерну
    println(String.format("%02d:%02d",arrivingHour, arrivingMinute))
}