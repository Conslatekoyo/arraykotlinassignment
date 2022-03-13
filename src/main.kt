/*.Write a function that takes in an array of integers and returns the product of
all the elements(3pts)
2.Write a function that takes in an array of mixed types and returns the sum of
all the decimal elements(3pts)
3.Write a function that takes in an array of characters and returns the number of
vowels in the array */

fun main() {
    var x =product(arrayOf(2,3,4,5,6,7))
    println(x)
    var y =sum(arrayOf("school",34.7F,54.2,6.5F,1,"daily",7,0))
    println(y)
    var w = vowels(arrayOf('a','w','c','e','o','u','d','i'))
    println(w)

}
fun product(numbers:Array<Int>): Int{
    var result=1
    numbers.forEach { name ->
        result *= name
    }
    return result
}

fun sum(arrayMixed:Array<Any>) :Double {
    var addition=0.0
    arrayMixed.forEach { all->
        if  (all is Double)
            addition+= all
    }
    return addition

}
fun vowels(getNumber:Array<Char>):Int {
    var character = 0
    getNumber.forEach { neno ->
        if (neno == 'a' || neno == 'e' || neno == 'i' || neno == 'o' || neno == 'u') {
            character++
        }
    }
    return character
}