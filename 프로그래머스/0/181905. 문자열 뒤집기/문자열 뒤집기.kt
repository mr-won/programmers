class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        val sb = StringBuilder()
        sb.append(my_string.substring(0, s))
            .append(my_string.substring(s, e + 1).reversed())
            .append(my_string.substring(e + 1))

        return sb.toString()
    }
}