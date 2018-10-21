/*
 * Created by Muhammad Zharif Fadzli Bin Rusli zhariffadzli@gmail.com
 */

fun main(args:Array<String>){

    var arrayList=ArrayList<String>()
    arrayList.add("Maggi")
    arrayList.add("JAmy")
    arrayList.add("Zharif")
    arrayList.add("Fadzli")

    println("First Name: " + arrayList.get(0))
    println(arrayList[1])

    arrayList.set(0, "Zharif Fadzli")

            for(item in arrayList) {
                println(item)
            }

    //print element by index
    println("Print Element by index")

    for (index in 0.. arrayList.size-1){
        println(arrayList.get(index))

    }
    

    //search
    if(arrayList.contains("Amy")){
        println("Amy is found")
    }else{
        println("Amy is not found")
    }

    //delete
    //arrayList.




}