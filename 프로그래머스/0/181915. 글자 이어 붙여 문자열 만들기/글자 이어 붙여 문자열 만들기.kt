class Solution {
    fun solution(my_string: String, index_list: IntArray): String {

        val answer = StringBuilder()
        
        index_list.forEach {
            answer.append(my_string[it])
        }

        return answer.toString()
    }
}