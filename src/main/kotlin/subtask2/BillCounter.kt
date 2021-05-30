package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = bill.sum()
        var result = (sum - bill[k]) / 2
        if (result == b)
            return "Bon Appetit"
        else
            return (b - result).toString()
    }
}
