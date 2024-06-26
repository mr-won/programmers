class Solution {
    fun solution(a: Int, b: Int): Int {

        // a를 문자로 변경
        var string_a = a.toString()
        
        // b를 문자로 변경
        var string_b = b.toString()
        
        var temp = string_a + string_b
        
        var int_temp = temp.toInt()
        
        var ab2 = 2 * a * b
        
        if(int_temp > ab2) {
            return int_temp
        } else return ab2
    }
}