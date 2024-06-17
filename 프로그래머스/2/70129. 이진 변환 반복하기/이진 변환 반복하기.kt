class Solution {
    fun solution(s: String): IntArray {
        var result: IntArray = intArrayOf(0, 0)
        var temp: String = s
        var count: Int = 0
        
        while(temp.length != 1){
            count += temp.count{ it == '0'}
            result[0]++
            temp = temp.replace("0", "")
            // 2진수로 변환
            temp = Integer.toBinaryString(temp.length)
        }
        
        result[1] = count
        
        return result
    }
}