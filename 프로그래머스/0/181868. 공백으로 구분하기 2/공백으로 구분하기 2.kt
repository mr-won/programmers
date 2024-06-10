class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        // my_string을 공백으로 구분한 리스트를 문자열배열로 반환
        answer = my_string.split(" ").filter { it.isNotEmpty() }.toTypedArray()
     
        return answer
    }
}