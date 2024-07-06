class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        val length = arr.size // arr의 길이
        val result = arr.copyOf()

        if (length % 2 == 1) {
            for (i in result.indices step 2) {
                result[i] += n
            }
        } else {
            for (i in 1 until length step 2) {
                result[i] += n
            }
        }

        return result
    }
}