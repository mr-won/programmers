class Solution {
    fun solution(n: Int): Int {
    	// n+1 크기의 배열을 1로 초기화
        var arr = IntArray(n + 1){1}
        arr[0] = 0
        // 3부터 n까지 반복하며 피보나치 수를 배열에 저장해 줍니다.
        
        if (n > 2) {
            (3..n).forEach { arr[it] = (arr[it-1] + arr[it-2]) % 1234567 }
        }
        return arr[n]
    } 
}


