class Solution {
    fun solution(myString: String, pat: String): Int {      
        if(myString.lowercase().contains(pat.lowercase())) {
            return 1
        } else return 0
    }
}