import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c) {
        int[] intArray = {a, b, c};
        
        if(a == b && b == c) {
            return powNumber(intArray, 3);
        } else if(a == b || a == c || b == c) {
            return powNumber(intArray, 2);
        } else {
            return powNumber(intArray, 1);
        }
    }
    
    private int powNumber(int[] intArray, int pow) {
        int result = Arrays.stream(intArray)
            .map(num -> (int)Math.pow(num, pow))
            .sum();
        return  result = pow - 1 > 0 ? result * powNumber(intArray, pow-1) : result;
    }
    
}
