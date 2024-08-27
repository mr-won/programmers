class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int w,h,d = 0;
        
        w = box[0]/n; // 가로길이
        h = box[1]/n; // 세로길이
        d = box[2]/n; // 높이길이
        answer=w*h*d;
        
        return answer;
    }
}