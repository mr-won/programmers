import java.io.*;
import java.util.*;

public class Main {

	static StringBuilder sb = new StringBuilder();

	static int H, W, N;
	
	static int[][] map;

	static int[][] dp;
	

	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
	
		map = new int [H+2][W+2];
		dp = new int [H+2][W+2];
		
		for (int i = 1; i <= H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= W; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[1][1] = N - 1;
		int tmp;
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				tmp = dp[i][j];

				// 2-1. 교차로에 '오'
				if (map[i][j] == 1) {
					// 오른쪽에 횟수 더해주기
					dp[i][j + 1] += (tmp / 2);

					// 아래에 횟수 더해주기 
					dp[i + 1][j] += (tmp / 2);

					// 방문횟수 홀수면 보정
					if ( (tmp & 1) == 1 ) {
						dp[i][j + 1] ++;
					}

				}
				// 2-2. '아' 
				else {
					// 오른 
					dp[i][j + 1] += (tmp / 2);

					// 아래
					dp[i + 1][j] += (tmp / 2);

					// 홀수면 아래로 한 번 더
					if ( (tmp & 1) == 1) {
						dp[i + 1][j] ++;
					}
				}
			}
		}



		int ansR, ansC; 
		ansR = ansC = 1;
		while (ansR <= H && ansC <= W) {

			if (  (dp[ansR][ansC] & 1) == 1 && map[ansR][ansC]==0  
				|| (dp[ansR][ansC] & 1) ==0 && map[ansR][ansC]==1 ) {
				ansC++;
			}
			else {
				ansR++;
			}
		}
	
		System.out.println(ansR+" "+ansC);
		br.close();
	}
}