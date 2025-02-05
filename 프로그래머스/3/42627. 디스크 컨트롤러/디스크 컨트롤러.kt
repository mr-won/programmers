import java.util.*

data class compPair(var first: Int, var second: Int): Comparable<compPair>{
    override fun compareTo(other : compPair) = when
    {
        first> other.first -> 1
        first< other.first -> -1
        else -> 0
    }
}
class Solution {
        fun solution(jobs: Array<IntArray>): Int {
            var answer = 0
            var remain = PriorityQueue<compPair>()
            var end = arrayOf<IntArray>()
            var count = 0
            var run = false
            var tmp = compPair(0,0)
            while(jobs.size > end.size)
            {
                if(remain.size>0||run)
                {
                    if(!run)
                    {
                        tmp = remain.poll()
                        run =true
                    }
                    tmp.first--
                    if(tmp.first == 0&&run)
                    {
                        end += intArrayOf(tmp.second,count)
                        run =false
                    }
                }
                for(job in jobs)
                {
                    if(count == job[0])
                    {
                        remain.add(compPair(job[1],job[0]))
                    }
                }
                count++
            }
            var sum = 0
            for(s in end)
            {
                sum += s[1] - s[0]
                println(s.toList())
            }
            answer = sum/jobs.size

            return answer
        }
}
