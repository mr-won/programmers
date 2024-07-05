class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
       if (arr1.size != arr2.size) {
            return if (arr1.size > arr2.size) {
                1
            } else {
                -1
            }
        } else {
            val arr1Sum = arr1.sum()
            val arr2Sum = arr2.sum()
            
            return if (arr1Sum > arr2Sum) {
                1
            } else if (arr1Sum == arr2Sum) {
                0
            } else {
                -1
            }
        }

    }
}