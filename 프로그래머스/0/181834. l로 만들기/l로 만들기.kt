class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        // 정규식을 이용한 표현 a부터 k까지를 l로 바꾼다.
        answer = myString.replace("[a-k]".toRegex(), "l")
        return answer
    }
}