class Solution {
    fun solution(gems: Array<String>): IntArray {
        var answer = intArrayOf()

        // gems에서 중복 제거
        val gem = gems.distinct().size

        val gemCount = mutableMapOf<String, Int>()
        var left = 0
        var right = 0
        var result = Int.MAX_VALUE
        // 투포인터 사용
        while (true) {
            if (gemCount.size == gem) {
                if (result > right - left) {
                    result = right - left
                    answer = intArrayOf(left + 1, right)
                }
                val leftGem = gems[left]
                gemCount[leftGem] = gemCount.getOrDefault(leftGem, 0) - 1
                if (gemCount[leftGem] == 0) {
                    gemCount.remove(leftGem)
                }
                left++
            } else if (right == gems.size) { // 목록 끝에 도달하면 종료
                break
            } else {
                val rightGem = gems[right]
                gemCount[rightGem] = gemCount.getOrDefault(rightGem, 0) + 1
                right++
            }
        }

        return answer
    }
}