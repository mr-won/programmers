class Solution {
    fun solution(x: Int): Boolean {
        var sum = 0
        var tempX = x

        // 자릿수의 합 sum을 구함
        while (tempX != 0) {
            sum += tempX % 10
            tempX /= 10
        }


        // x를 자릿수의 합으로 나누어 떨어진다면 true, 아니면 false 
        return (x % sum == 0)
    }
}