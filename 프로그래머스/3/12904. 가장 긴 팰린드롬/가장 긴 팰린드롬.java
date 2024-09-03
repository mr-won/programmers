class Solution
{
    public int solution(String s)
    {
        int answer =0;
        int n= s.length();
        
        loop:
        for(int i=n; i>=1; i--){ 
            for(int j=0; j<=n-i; j++){
               boolean flag= true;
               int st=j; //시작 인덱스 
               int en=j+i-1; // 끝 인덱스 
               
               while(st<en){ 
                   if(s.charAt(st)!=s.charAt(en)){
                       flag=false;
                       break;
                   }
                   st++;
                   en--;
               }
               if(flag){ 
                   answer=i;
                   break loop;
               }
            }
               
        }
        return answer;
    }
   
}