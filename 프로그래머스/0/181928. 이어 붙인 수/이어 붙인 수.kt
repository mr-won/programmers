class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
       
        // 짝수만 이어붙인 리스트
        val even_list = num_list.filter { it % 2 == 0 }.joinToString("")
      
        // 홀수만 이어붙인 리스트
        val odd_list = num_list.filter { it % 2 == 1 }.joinToString("")
        
        answer = even_list.toInt() + odd_list.toInt()
        
        return answer
    }
}