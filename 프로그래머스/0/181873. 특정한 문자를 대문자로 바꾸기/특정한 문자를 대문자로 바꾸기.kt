class Solution {
    fun solution(my_string: String, alp: String): String {
        var answer: String = ""
        
        answer = my_string.replace(alp, alp.toUpperCase());
        
        return answer
    }
}