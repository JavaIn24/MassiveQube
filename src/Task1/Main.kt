package Task1

import kotlin.random.Random

fun main(){
    var matrix = arrayOf(
        arrayOf(4,58,5,9),
        arrayOf(8,16,32,7),
        arrayOf(9,18,32,64)
    )
    var min = matrix[0][0]
    for ( i  in matrix.indices){
        for (j in matrix[i].indices){
            if (min>matrix[i][j]){
                min = matrix[i][j]
            }
            print("${matrix[i][j]} ")
        }
        println()

    }
   println("Минимальное занчение элемента = $min")
}