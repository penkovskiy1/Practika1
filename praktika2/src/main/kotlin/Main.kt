fun main(args: Array<String>) {

    //задание1
    val age1 =  42.0
    val age2 = 21.0

    //зд 2
    val avg1 = (age1+age2)/2

    //задание3
    /* необходимо преобразовать age1 и age2 в double*/

    //задание4
    val firstName = "Кирилл"
    val lastName = "Пеньковский"

    //задание5
    val fullName = "$firstName $lastName"

    //задание6
    val myDetails = "привет, меня зовут $firstName $lastName)"

    //задание7
    val Triple: Triple < Int, Int, Int > = Triple (15, 9, 2023)


    //задание8
    val month = Triple.first
    val day = Triple.second
    val year = Triple.third

    //задание9
    val mounthResult = "$month"
    val yearResult = "$year"
    println("$mounthResult месяц, $yearResult год")

    //задание 10
    val date = Triple(1, 17, 2005)
    var (month1, _, year1) = date
    month1 = 10
    val updatedDate = Pair(month1, year1)
    println("дата: $updatedDate")

}
