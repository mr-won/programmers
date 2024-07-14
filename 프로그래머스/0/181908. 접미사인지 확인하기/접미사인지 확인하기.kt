class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
         val list: List<String> = my_string.indices
            .map { my_string.substring(it) }
            .sorted()

        return if (list.contains(is_suffix)) 1 else 0
    }
}