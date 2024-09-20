import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int T, n, k, w; //테케, 정점, 간선, 타겟정점
	static int[] time; //각 정점의 건설시간
	static int[] indegree; //각 정점의 진입차수의 개수
	static int[] dp; //각 정점까지 걸리는 건설시간
	static ArrayList<ArrayList<Integer>> list; //간선표시
	static Queue<Node1005> q; //이전,현재 정점 넣어줄 큐
	static class Node1005{ //이전,현재 정점 나타내는 클래스
		int preV;//이전
		int curV;//현재
		public Node1005(int preV, int curV) {
			this.preV = preV;
			this.curV = curV;
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			dp = new int[n+1];
			
			st = new StringTokenizer(br.readLine());
			time = new int[n+1];
			for(int t=1; t<=n; t++) {
				time[t] = Integer.parseInt(st.nextToken());
				dp[t] = Integer.MIN_VALUE;
			}
			
			list = new ArrayList<ArrayList<Integer>>();
			for(int l=0; l<=n; l++)
				list.add(new ArrayList<Integer>());
			
			indegree = new int[n+1];
			for(int j=0; j<k; j++) {
				st = new StringTokenizer(br.readLine());
				int v1 = Integer.parseInt(st.nextToken());
				int v2 = Integer.parseInt(st.nextToken());
				
				list.get(v1).add(v2);
				indegree[v2]++;
			}
			w = Integer.parseInt(br.readLine()); //타겟 정점
			
			
			if(indegree[w]==0) {//타겟 정점이 시작 정점일때
				sb.append(time[w]).append("\n");
				continue;
			}
			
			topologicalSort();//위상정렬
			sb.append(dp[w]).append("\n");
		}
		
		System.out.println(sb.toString());//출력
		
	}
	
	//위상정렬
	public static void topologicalSort() {
		q = new LinkedList<Node1005>();
	
		int addCnt = 0; 
		
		//시작정점들 탐색 -> 진입차수가 0인 것들
		for(int i=1; i<=n; i++) { 
			if(indegree[i]==0) {
				addCnt++;
				q.add(new Node1005(0, i));
			}
		}
		
		while(!q.isEmpty()) {
			//sectionSort를 통해 addCnt개수 만큼 끊어서 위상정렬 시작
			if(addCnt!=-1) addCnt = sectionSort(addCnt);
			else return;
		}
	}
	
	public static int sectionSort(int addCnt) {
		int cnt = 0; //큐에 드가는 정점 개수세는 변수(진입차수 0이되는 것들)
		
		//addCnt개수만큼 돌리기
		for(int i=0; i<addCnt; i++) {
			Node1005 v = q.poll();

			//현재 정점이 타겟과 같으면 dp배열 갱신 후 -1 반환.
			if(v.curV==w) {
				//현재 정점까지 걸리는 시간 = Math.max(이전 정점까지 걸리는시간+현재 정점의 건설시간 , 현재 정점까지 걸리는 시간)
				dp[v.curV] = Math.max(dp[v.preV]+time[v.curV], dp[v.curV]);
				return -1;
			}
			
			dp[v.curV] = Math.max(dp[v.preV]+time[v.curV], dp[v.curV]);
			
			//현재 정점에 인접한 노드를 탐색
			for(int j=0; j<list.get(v.curV).size(); j++) {
				int nextV = list.get(v.curV).get(j);
				indegree[nextV]--;//현재 정점을 탐색했기때문에 인접노드의 진입차수 하나 감소
				
				//인접노드가 진입차수가 0이될때 큐에 추가, cnt 증가
				if(indegree[nextV]==0) {
					q.add(new Node1005(v.curV, nextV));
					cnt++;
				}else {
					
					dp[nextV] = Math.max(dp[v.curV]+time[nextV], dp[nextV]);
				}
			}
		}
		
		return cnt; //큐에추가된 노드 개수만큼 반환.
	}
}
