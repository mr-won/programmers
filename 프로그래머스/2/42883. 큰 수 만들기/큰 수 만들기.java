import java.util.*;
class Solution {
    public String solution(String number, int k) {
        // 그리디 알고리즘
        // 각 자리에서 최고로 높은 수가 나오는 경우를 생각하기
        
        String answer = "";
        StringBuilder answerBuilder = new StringBuilder();

        
        char[] array = number.toCharArray();
        
        int len = array.length - k;
        
        int start = 0;

        for(int i =0; i<len; i++){
            char max = '0';
            for(int j = start; j <= i + k; j++){
                if(array[j] > max){
                    max = array[j];
                    start=j+1;
                }
            }
            answerBuilder.append(Character.toString(max));
        }
        
        answer = answerBuilder.toString();
        return answer;
    }
    
}