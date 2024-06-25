class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        if(n % 2 == 0) {
            // 1이 나올 때까지 2씩 내림 짝수일때 제곱의 합
            answer = (n downTo 1 step 2).sumOf { it * it }
        } else {
            // 홀수일 때는 그냥 합
            answer =(n downTo 1 step 2).sum()
        }
        
        return answer
    }
}