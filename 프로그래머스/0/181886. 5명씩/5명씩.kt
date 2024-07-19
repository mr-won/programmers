class Solution {
    fun solution(names: Array<String>): ArrayList<String> {
        val result = names.toMutableList().chunked(5) // 5명씩 묶는다.
        val resultArr = arrayListOf<String>()
        repeat(result.size) {
            resultArr.add(result[it][0]) // 리스트 각 데이터의 리스트 첫 번째 문자를 추가
        }

        return resultArr
    }
}