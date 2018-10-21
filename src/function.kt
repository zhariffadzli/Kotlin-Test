/*
 * Created by Muhammad Zharif Fadzli Bin Rusli zhariffadzli@gmail.com
 */


fun sum(n1:Double, n2:Double):Double{
    var sum = n1 + n2
    return sum


}

fun disply(n:Int):Unit{


    println("n: $n")

}


fun main(args:Array<String>){

    println("Enter your First Number:")
    var n1:Double = readLine()!!.toDouble()

    println("Enter your Second Number:")
    var n2:Double = readLine()!!.toDouble()

    var r = sum(n1,n2 )



    disply(22)


}