class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        // 1부터 n까지 필터
        answer = (1..n).filter {
            n % it == 0 // 약수 추출
        }.sum() // 약수의 총합
        return answer
    }
}