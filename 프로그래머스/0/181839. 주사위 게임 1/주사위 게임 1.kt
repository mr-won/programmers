class Solution {
    fun solution(a: Int, b: Int): Int {
        return when {
            // 모두 홀수라면 
            a % 2 == 1 && b % 2 == 1 -> a * a + b * b
            // 하나만 홀수라면
            a % 2 == 1 || b % 2 == 1 -> 2 * (a + b)
            // 모두 홀수가 아니라면 절댓값 a-b 
            else -> Math.abs(a - b)
        }
    }
}