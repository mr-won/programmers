class Solution {
    fun solution(a: Int, b: Int): Int {
        val ab = "$a$b" // a와 b를 합침
        val ba = "$b$a" // b와 a를 합침
        return if (ab.toInt() > ba.toInt() || ab.toInt() == ba.toInt()) {
            ab.toInt()
        } else {
            ba.toInt()
        }
    }
}