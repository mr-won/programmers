class Solution {
    val checkComputer = ArrayList<Int>()
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        
        for(i in computers.indices){
            if(checkComputer.contains(i)) continue 
            
            computers[i].forEachIndexed{ index, it ->
                if(it == 1) {
                    checkComputer.add(index)
                    checkNetWork(computers, index)
                }
            }
            answer++
        }
        
        return answer
    }
    
    fun checkNetWork(computers: Array<IntArray>, computer: Int){ 
        computers[computer].forEachIndexed{ index, it ->
            if(it == 1 && !checkComputer.contains(index)){
                checkComputer.add(index)
                checkNetWork(computers, index)
            }
        }
    }
}