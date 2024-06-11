import java.util.*

class Solution {
    fun solution(num_list: IntArray): IntArray {
        Arrays.sort(num_list)
        return num_list.copyOfRange(0, 5)
    }
}