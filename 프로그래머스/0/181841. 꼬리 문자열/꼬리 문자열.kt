class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        // ex를 포함한 문자열은 제외하고 문자열합치기
        answer = str_list.filterNot { it.contains(ex) }.joinToString("")
        return answer
    }
}