/*
 * Created by Muhammad Zharif Fadzli Bin Rusli zhariffadzli@gmail.com
 */



class Car(){
    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDrive:Int?= null
    var owner:String?=null
    constructor( type:String, model:Int, price:Double,
                  milesDrive:Int, owner:String):this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
        println("Constructor 1")
    }


    constructor(owner:String):this(){
        this.owner=owner
        println("constructor2")

    }

//    init{
//        println("Details of the Car is Type")
//        println("Type: $type")
//        println("Year Manufactured: $model")
//        println("Price: $price")
//        println("Miles Drive: $milesDrive")
//        println("Owner: $owner")
//    }

    fun getCarPrice():Double{
        return this.price!! - (this.milesDrive!!.toDouble()*10)

    }

}


fun main(args:Array<String>){

    val zhCar=Car("BMW",2015,10000.10,105, "Zharif")
    println("Zharif Car: " +zhCar.getCarPrice())
    val AmyCar=Car("Mercedes", 2016,5000.0, 205, "Wan Amira")
    println("Amy Car: " +AmyCar.getCarPrice())


    val laCar=Car("Zharif")
}