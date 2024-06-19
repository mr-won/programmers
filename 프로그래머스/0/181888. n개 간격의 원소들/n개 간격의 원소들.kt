class Solution {
    fun solution(numList: IntArray, n: Int): IntArray {
        val list = mutableListOf<Int>() // 가변리스트 선언
        for (i in numList.indices step n) { // step으로 간격 지정
            list.add(numList[i]) // 리스트에 요소 추가
        }

        return list.toIntArray() // Int 배열로 반환
    }
}