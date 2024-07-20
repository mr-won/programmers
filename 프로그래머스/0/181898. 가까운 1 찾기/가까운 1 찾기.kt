class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer = 0
        for (i in arr.indices) {
            if (i >= idx && arr[i] == 1) {
                answer = i
                break
            } else {
                answer = -1
            }
        }
        return answer
    }
}