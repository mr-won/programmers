class Solution {
    fun solution(myStrings: Array<String>, parts: Array<IntArray>): String {
        val answer = StringBuilder()

        // myStrings 배열의 원소와 parts 배열의 원소를 순서대로 매칭
        for (i in parts.indices) {
            val s = parts[i][0]
            val e = parts[i][1]
            // 부분문자열을 이어 붙임
            answer.append(myStrings[i].substring(s, e + 1))
        }

        return answer.toString()
    }
}