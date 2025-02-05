import java.util.*

class Solution
{
    fun solution(n: Int, results: Array<IntArray>): Int
    {
        var answer = 0
        var winMap = hashMapOf<Int, MutableList<Int>>()
        var loseMap = hashMapOf<Int, MutableList<Int>>()

        Mapping(n, winMap, results)

        for (i in results)
        {
            val temp = i[1]
            i[1] = i[0]
            i[0] = temp
        }

        Mapping(n, loseMap, results)

        for (i in winMap.keys)
        {
            var count = winMap[i]!!.size + loseMap[i]!!.size

            if (count == n - 1)
                answer++
        }

        return answer
    }

    fun Mapping(n: Int, map: HashMap<Int, MutableList<Int>>, results: Array<IntArray>)
    {
        for (i in 1..n)
        {
            var temp = mutableListOf<Int>()
            var q = LinkedList<Int>()

            for (j in results)
            {
                if (j[0] == i && !temp.contains(j[1]))
                {
                    temp.add(j[1])
                    q.add(j[1])
                }
            }

            while (q.size > 0)
            {
                var temp2 = q.poll()

                for (j in results)
                {
                    if (j[0] == temp2 && !temp.contains(j[1]))
                    {
                        temp.add(j[1])
                        q.add(j[1])
                    }
                }
            }

            map.put(i, temp)
        }
    }
}