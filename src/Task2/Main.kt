package Task2
fun main() {
    var matrix1 = arrayOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(4, 5, 7, 9, 3)

    )
    var middle : Int
    var countElem = 0
    for (tmpArr in matrix1) {
        countElem += tmpArr.size

    }
    val oneDArray = IntArray(countElem)
    var indRet = 0
    for (tmpArr in matrix1) {
        for (elemTmpArr in tmpArr) {
            oneDArray[indRet++] = elemTmpArr
        }
    }
    middle = oneDArray.size / 2
    if ((oneDArray.size / 2) != 0){
        println("Медиана ддвумерного массива равна ${oneDArray[middle]} ")
    }else {
        println("Медиана ддвумерного массива равна ${(oneDArray[middle - 1] + oneDArray[middle]) / 2} ")
    }
}
