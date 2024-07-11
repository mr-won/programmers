class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        var lower = myString.lowercase() // 모든 대문자를 소문자로 변경
        answer = lower.replace('a','A') // a를 A로 변경
        return answer
    }
}