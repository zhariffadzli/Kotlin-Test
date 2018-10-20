fun main(args:Array<String>){
    println("Enter X:")
    var X:Int= readLine()!!.toInt()
    println("Enter Y:")
    var Y:Int = readLine()!!.toInt()
    println("The Number will be swap:")

    X = X + Y;  // x now becomes 15
    Y = X - Y;  // y becomes 10
    X = X - Y;
    println("X :"+ X + " and Y: "+ Y)

    //this program is to swap number between X and Y
}
