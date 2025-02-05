class Solution {
data class Pos(val x: Int, val y: Int, val time: Int)

    fun solution(points: Array<IntArray>, routes: Array<IntArray>): Int {

        var answer: Int = 0
        val map = HashMap<Pos, Int>()

        for (route in routes) {
            var time = 0
            val startPos = Pos(points[route[0]-1][0], points[route[0]-1][1], time)
            map[startPos] = map.getOrDefault(startPos, 0) + 1
            for (index in 0..route.size-2) {
                var curX = points[route[index]-1][0]
                var curY = points[route[index]-1][1]
                val endX = points[route[index+1]-1][0]
                val endY = points[route[index+1]-1][1]

                while (curX != endX) {
                    time += 1
                    if (curX < endX) {
                        curX++
                    } else {
                        curX--
                    }
                    val pos = Pos(curX, curY, time)
                    map[pos] = map.getOrDefault(pos, 0) + 1
                }

                while (curY != endY) {
                    time += 1
                    if (curY < endY) {
                        curY++
                    } else {
                        curY--
                    }
                    val pos = Pos(curX, curY, time)
                    map[pos] = map.getOrDefault(pos, 0) + 1
                }
            }
        }


        return map.entries.filter { it.value > 1 }.count()
    }
}