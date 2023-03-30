fun main() {
    print(solution(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)))
}

fun solution(inputArray: MutableList<Int>): Int {
    var array = inputArray
    var isSumIteration = true

    while (array.size > 1) {
        val newArray = mutableListOf<Int>()

        for (i in 0 until array.size step 2) {
            if (isSumIteration) {
                newArray.add(array[i] + array[i+1])
            } else {
                newArray.add(array[i] * array[i+1])
            }
        }

        array = newArray
        isSumIteration = !isSumIteration
    }

    return array[0]
}

