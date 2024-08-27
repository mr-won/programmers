// 가위 = 2, 바위 = 0, 보 = 5
// 순서 = rsp = 매개변수
// rsp의 가위 바위 보를 모두 이기는 경우

class Solution {
    public String solution(String rsp) {
        String answer = "";
        // answer를 빈 문자열로 초기화하였다.
        
        char scissors = '2';
        char rock = '0';
        char paper = '5';
        
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.charAt(i) == scissors){
            	// chatAt를 통해 i번째 인덱스에 위치한 값을 가져올 수 있게 된다. 
                // chatAt()는 문자열에서 특정 위치에 있는 문자를 가져오는데 사용
                
                answer += rock;
                
            }else if(rsp.charAt(i) == rock){
            
                answer += paper;
                
            }else if(rsp.charAt(i) == paper){
                 
                answer += scissors;
            
            }
        }
            
        return answer;
    }
}