import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int MAX = 30;
    static int N, K;
    static char[] str;
    static boolean[][][][] dp;

    static void input() {
        Reader scanner = new Reader();

        N = scanner.nextInt();
        K = scanner.nextInt();
        str = new char[N];
        dp = new boolean[MAX + 1][MAX + 1][MAX + 1][((MAX * (MAX - 1)) / 2) + 1];
    
    }

    static void solution() {
        if(findStr(0, 0, 0, 0)) System.out.println(new String(str));
        else System.out.println(-1);
    }

    static boolean findStr(int idx, int a, int b, int pairNum) {
        if(idx == N) {
            
            if(pairNum == K) return true;
            return false;
        }

       
        if(dp[idx][a][b][pairNum]) return false;
      
        dp[idx][a][b][pairNum] = true;

       
        str[idx] = 'A';
      
        if(findStr(idx + 1, a + 1, b, pairNum)) return true;

        str[idx] = 'B';
       
        if(findStr(idx + 1, a, b + 1, pairNum + a)) return true;

   
        str[idx] = 'C';
   
        if(findStr(idx + 1, a, b, pairNum + a + b)) return true;
        
        return false;
    }

    public static void main(String[] args) {
        input();
        solution();
    }

    static class Reader {
        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}