class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer = arr.toMutableList() // remove 메서드를 사용하기 위함 

        for (i in delete_list.indices) { // delete_list의 요소들을 돌면서
            answer.remove(delete_list[i]) // 해당하는 요소가 있으면 answer에서 삭제함
        }

        return answer.toIntArray() // 다시 IntArray로 변경하고 반환함
       
    }
}