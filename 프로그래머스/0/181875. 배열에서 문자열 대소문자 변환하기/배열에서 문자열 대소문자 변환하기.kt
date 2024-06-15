class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        return strArr.mapIndexed { index, str ->
            if (index % 2 == 0) {
                str.lowercase() // 짝수면 소문자로
            } else str.uppercase() // 홀수면 대문자로
        }.toTypedArray()
    }
}