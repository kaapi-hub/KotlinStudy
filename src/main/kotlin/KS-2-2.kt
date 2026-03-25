fun main(){
    val workerSalary = 30000 //зарплата сотрудника
    val internSalary = 20000 // зарплата стажера
    val workersQuantity = 50
    val internQuantity = 30

    val totalWorkerSalary = workerSalary * workersQuantity
    println(totalWorkerSalary) // выведет зарплату всех основных сотрудников

    val totalSalary = totalWorkerSalary + internSalary * internQuantity
    println(totalSalary) // выведет общий ФОТ компании

    val averageSalary = totalSalary/(workersQuantity+internQuantity)
    println(averageSalary) // выведет среднюю ЗП по фирме
}