fun main(){
    val crystal = 7
    val iron = 11

    val buff = 0.2

    val buffedCrystal = (crystal * buff).toInt()
    val buffedIron = (iron * buff).toInt()
    println("Пробаффаная кристаллическая руда: $buffedCrystal")
    println("Пробаффаная железная руда: $buffedIron")

}