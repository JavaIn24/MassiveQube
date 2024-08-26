package Task3

fun main () {
    var matrix: Array<Array<Int>> = Array(5) { Array(5) { 0 } }
    for (i in matrix.indices) {
        for (j in matrix.indices) {

            if (i == 2 && j == 2) {
                matrix[i][j] = 1
            }
            if (i == 3 && j in 1..3) {
                matrix[i][j] = 1
            }
            if (i == 4 && j in 0..4) {
                matrix[i][j] = 1
            }
            print("${matrix[i][j]} ")


        }
        println()
    }
}