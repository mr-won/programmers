class Solution {
    fun solution(numList: IntArray): Int {
        var odd = 0
        var even = 0
        numList.forEachIndexed { index, i ->
            if (index % 2 == 0) {
                odd += i
            } else {
                even += i
            }
        }

        return if (odd > even) {
            odd
        } else if (odd < even) {
            even
        } else {
            odd
        }
    }
}