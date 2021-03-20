package sorting

import java.util.*

// Complete the insertionSort1 function below.
fun insertionSort1(n: Int, arr: Array<Int>): Unit {

    var size = arr.size

    val x = arr[size - 1]

    for (i in size - 1 downTo 0) {
        if(i == 0){
            arr[i] = x
            println(arr.joinToString(" "))
        } else if (arr[i - 1] > x) {
            arr[i] = arr[i - 1]
            println(arr.joinToString(" "))
        } else {
            arr[i] = x
            println(arr.joinToString(" "))
            break
        }
    }


}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    insertionSort1(n, arr)
}
