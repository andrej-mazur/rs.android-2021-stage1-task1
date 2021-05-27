package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val brackets = mapOf(
            '[' to Pair('[', ']'),
            '<' to Pair('<', '>'),
            '(' to Pair('(', ')')
        )
        val result = mutableListOf<String>()
        for (i in inputString.indices) {
            val iChar = inputString[i]
            brackets[iChar]?.let { (openingBracket, closingBracket) ->
                var counter = 0
                for (j in i + 1 until inputString.length) {
                    val jChar = inputString[j]
                    if (jChar == openingBracket) {
                        counter++
                    }
                    if (jChar == closingBracket) {
                        if (counter == 0) {
                            val substring = inputString.substring(i + 1, j)
                            result.add(substring)
                            break
                        }
                        counter--
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}
