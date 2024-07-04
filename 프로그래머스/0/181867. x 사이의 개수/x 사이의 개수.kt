class Solution {
    fun solution(myString: String): IntArray {
        var answer = mutableListOf<Int>()
        
        // 문자 x를 기준으로 나눈다.
        var splitStr = myString.split('x')
        
        for (str in splitStr) {
            answer.add(str.length)
        }
        
        return answer.toIntArray()

    }
}