fun main() {
    val mark1 = 3
    val mark2 = 4
    val mark3 = 3
    val mark4 = 5
    val quantityOfStudents = 4

    val score = ((mark1 + mark2 + mark3 + mark4) / quantityOfStudents).toDouble()
    println(String.format("%.2f", score))
}