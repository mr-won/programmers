class Solution {
    fun solution(arr: IntArray): IntArray {
         
        val answer = arrayListOf<Int>()
        
        for (i in arr) {
            // i번 만큼 반복
            repeat(i) {
                answer.add(i)
            }
        }

        return answer.toIntArray()
    }
}