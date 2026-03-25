fun main() {
    val workerSalary = 30000
    val internSalary = 20000
    val workersQuantity = 50
    val internQuantity = 30

    val totalWorkerSalary = workerSalary * workersQuantity
    println(totalWorkerSalary)

    val totalSalary = totalWorkerSalary + internSalary * internQuantity
    println(totalSalary)

    val averageSalary = totalSalary / (workersQuantity + internQuantity)
    println(averageSalary)
}