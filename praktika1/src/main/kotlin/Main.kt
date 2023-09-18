fun main() {
    //задание1
    val exercises = 13
    var exercisesSolved = 0

    //задание2
    val age: Int = 18

    //задание3
    var averageAge: Double = age.toDouble()
    averageAge = (age + 30) / 2.0

    //задание4
    val testNumber = 42
    val evenOdd = testNumber % 2

    //задание5
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3

    //задание6. Ответ: val, так как возраст обычно не изменяется.
    val ageForCompilation: Int = 30

    //задание7
    val a = 10
    val b = 5
    val answer2 = a + b

    //задание8
    val result = (5 * 3) - ((4 / 2) * 2)

    //задание9
    val a1: Double = 2.0
    val b2: Double = 20.0
    val average: Double = (a + b) / 2.0

    //задание10
    val fahrenheit: Double = 68.0
    val celcius: Double = (fahrenheit - 32) / 1.8

    //Вывод
    println("exercisesSolved: $exercisesSolved")
    println("age: $age")
    println("averageAge: $averageAge")
    println("evenOdd: $evenOdd")
    println("answer: $answer")
    println("answer2: $answer2")
    println("result: $result")
    println("average: $average")
    println("celcius: $celcius")
}