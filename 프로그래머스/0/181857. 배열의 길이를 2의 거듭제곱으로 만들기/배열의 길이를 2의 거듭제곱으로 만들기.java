class Solution {
    public int[] solution(int[] arr) {
        // 1. 초기 n 값 설정: 배열의 길이보다 크거나 같은 가장 작은 2의 제곱수를 찾기 위한 변수입니다.
        int n = 1;
        
        // 2. 배열의 길이보다 크거나 같은 가장 작은 2의 제곱수를 찾는 과정입니다.
        // 배열의 길이보다 작은 동안 n을 2배씩 늘려나갑니다.
        while (arr.length > n) {
            n *= 2;
        }
        
        // 3. 결과 배열 생성: 크기가 n인 배열을 생성합니다. 초기값은 모두 0입니다.
        int[] result = new int[n];
        
        // 4. 기존 배열의 값을 결과 배열에 복사합니다.
        // arr의 값을 차례로 result에 복사합니다.
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        
        // 5. 결과 배열을 반환합니다. 결과 배열은 크기가 2의 제곱수이며, 기존 배열의 값을 그대로 포함합니다.
        return result;
    }
}