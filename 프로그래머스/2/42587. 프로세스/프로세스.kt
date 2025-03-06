import java.util.*

class Solution {
    
    fun solution(priorities: IntArray, location: Int): Int {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        val sortedPriorities = priorities.sortedDescending().toMutableList()
        var count = 0

        // 큐 초기화 (index, priority)
        priorities.forEachIndexed { index, priority ->
            queue.add(index to priority)
        }

        while (queue.isNotEmpty()) {
            val (index, priority) = queue.poll()

            // 현재 프로세스의 중요도가 가장 높은 경우 실행
            if (priority == sortedPriorities.first()) {
                count++
                sortedPriorities.removeAt(0)
                if (index == location) return count
            } else {
                queue.add(index to priority) // 다시 뒤로 보냄
            }
        }
        return -1 // 도달할 수 없는 경우 (이론적으로는 발생하지 않음)
    }
}