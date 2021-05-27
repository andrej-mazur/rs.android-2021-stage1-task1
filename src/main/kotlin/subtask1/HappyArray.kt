package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) {
            return sadArray
        } else {
            val list = sadArray.toMutableList()
            var index = 1
            while (index < list.size - 1) {
                if (list[index] > list[index - 1] + list[index + 1]) {
                    list.removeAt(index)
                    if (index > 1) {
                        index--
                    }
                } else {
                    index++
                }
            }
            return list.toIntArray()
        }
    }
}
