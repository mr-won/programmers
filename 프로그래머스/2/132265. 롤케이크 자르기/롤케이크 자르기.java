import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> brother_1 = new HashMap<>(); // 형
        Map<Integer, Integer> brother_2 = new HashMap<>(); // 동생
        
        for (int e : topping) {
            brother_2.put(e, brother_2.getOrDefault(e, 0) + 1);
        }
        
        for (int e : topping) {
            brother_1.put(e, brother_1.getOrDefault(e, 0) + 1);
            
            if (brother_2.get(e) - 1 == 0)
                brother_2.remove(e);
            else
                brother_2.put(e, brother_2.get(e) - 1);  
            
            if (brother_1.size() == brother_2.size())
                answer++;
        }

        return answer;
    }
}