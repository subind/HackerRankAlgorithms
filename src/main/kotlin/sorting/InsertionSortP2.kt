package sorting

import java.util.*

// Complete the insertionSort2 function below.
fun insertionSort2(n: Int, arr: Array<Int>): Unit {

    for (i in 1 until arr.size) {
        var temp = 0
        for (j in i downTo 1) {
            if (arr[j - 1] > arr[j]) {
                temp = arr[j]
                arr[j] = arr[j - 1]
                arr[j - 1] = temp
            }
        }
        println(arr.joinToString(" "))
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    insertionSort2(n, arr)
}
