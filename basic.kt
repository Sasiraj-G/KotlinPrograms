/*
//variable declaration and Data types
var name : String = "sasiraj"
var age : Int = 19
var study : Boolean =true
var weight : Double = 51.09
var initial : Char ='G'
lateinit var car : String
var color : String ? =null


fun main(){
    car="bmw"
    println(car)
    println("My name is $name")
    println("IM $age years old")
    println("Currently studying $study")
    println(" My weight is $weight")
    println("My initial letter is $initial")

}
*/

// Kotlin String and String function

/*
var name : String ="sasiraj"
fun main(){
    print(name[0])
    var subject : String = "Computer science"
    println(name.toUpperCase())
    println("Length of the string ${subject.length}")
    println(subject.indexOf("Computer"))

    var n1 : String = "saa"
    var n2 : String ="raa"
    println(n1.plus(n2)) //saaraa
}

 */


/*
// for loops
fun main(){
for(alpha in 'a'..'x')
    print(alpha+" ")

}

//kotlin array
fun main(){
    var cars= arrayOf("bmw","Audi","Fortunor","lambocani")
    if("ninja" in cars){
        println("car exists!")
    }else{
        println("It does not exists")
    }
}

// kotlin when condition
fun main(){
    val day=1
    val result=when(day){
        1 -> "Monday"
        2 -> "TuesDay"
        3 -> "Wednesday"
        4 -> "thursday"
        5 -> "Firday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    print(result)
}

 */


// if else conditons
/*
var time=22
fun main(){
  var result =  if(time < 18) " Good morning " else "Good Evening`"
    print(result)
} /*
 */
 */

// function with argument and return type

//fun sum(x : Int,y : Int) : Int{
//  return x + y
//}
//fun main(){
//  println(sum(5,0))
//}

// function with argument and no return type
/*
fun printMessage(message : String,prefix : String){
  println("$message   $prefix"  )

}

fun main(){
  printMessage(message= "sasi", prefix = "hello")

}  */

//omitted parameter

/*
fun sum(x : Int,y : Int) = x + y

fun main(){
  print(sum(5,9))
}

 */

//lambda function or higher order function fkdi





