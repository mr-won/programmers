class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int countMax = 0;
        int arrayMax = 0;
    
        
        for (int i=0; i<array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
        }
        
        int [] arr = new int[arrayMax+1];
        
        for (int j=0; j<array.length; j++) {
            arr[array[j]]++;
        }
        
        for (int k=0; k<arr.length; k++) {
            if (countMax < arr[k]) {
                countMax = arr[k];
                answer = k;
            }
        }
        
        int count = 0;
        // 4. countMax가 여러개인지 확인
        for (int j=0; j<arr.length; j++) {
            if (arr[j]==countMax) {
                count++;
            }
        }
        
        if (count > 1) {
            return -1;
        } else {
        	return answer;
        }
        
    }
}