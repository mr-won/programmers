class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(i in 0 .. todo_list.size-1){
            if(!finished[i]) answer += todo_list[i]
        }
        return answer
    }
}