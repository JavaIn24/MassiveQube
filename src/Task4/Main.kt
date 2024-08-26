package Task4

fun main () {
    // Не до конца понял ТЗ по поводу набора целых чисел, поэтому два варианта
    // Вариант 1 - одномерный массив
    println("Второе максимальное значение для одномерного массива")
    var array = arrayOf(1, 223, 885, 4, 152, 69, 74, 86, 78)
    array.sort()
    println(array.contentToString())
    println("Второе максимальное значение массива равно ${array[array.size - 2]} ")
    println()
   //Вариант 2
    var arraymatrix = arrayOf(
        arrayOf(1,2,4,5,8),
        arrayOf(1,2,8,7,56),
        arrayOf(1,5,8,7,87)
    )
    println("Второе максимальное значение для двумерного массива")
    for (row in arraymatrix){
        for (row1 in row){
            print("${row1}\t")
        }
        println()
    }
    var countElem = 0
    for (elem in arraymatrix){
        countElem += elem.size
    }
    var oneLength = IntArray(countElem)
    var indexElem = 0
    for (elem in arraymatrix){
        for (elem2 in elem){
            oneLength[indexElem++] = elem2
        }
    }
    oneLength.sort()
    println("Второе максимальное значение массива равно ${oneLength[oneLength.size - 2]} ")
}