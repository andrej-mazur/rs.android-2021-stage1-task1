package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairlyAmount = (bill.sum() - bill[k]) / 2
        return if (b <= fairlyAmount) "Bon Appetit" else (b - fairlyAmount).toString()
    }
}
