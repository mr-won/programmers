class Solution {
    fun solution(myString: String, pat: String): Int {
        val str = myString.map { 
                when (it) {
                    'A' -> 'B' // A일때 B로
                    'B' -> 'A' // B일때 A로
                    else -> it // 그대로
                }
            }.joinToString("")

            if(str.contains(pat)) {
                return 1
            } else return 0
    }
}