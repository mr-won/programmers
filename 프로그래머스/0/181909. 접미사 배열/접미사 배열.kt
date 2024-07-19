class Solution {
    fun solution(my_string: String): Array<String> {
    
        val suffixes = mutableListOf<String>()
        
        for (i in my_string.indices) {
            suffixes.add(my_string.substring(i))
        }
        
        return suffixes.sorted().toTypedArray()
    }   
}