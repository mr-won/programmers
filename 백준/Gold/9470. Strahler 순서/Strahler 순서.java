import java.util.*;
import java.io.*;
public class Main {

    static int t = 0;
    static int n = 0;
    static int m = 0;

    static int[] pathNum;
    static int num = 0;

    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        t = Integer.parseInt(st.nextToken());

        for(int k=1;k<=t;k++){
            st = new StringTokenizer(bf.readLine(), " ");
            num = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            pathNum = new int[n+1];

            graph = new ArrayList[n+1];

            for(int i=1;i<=n;i++){
                graph[i] = new ArrayList<>();
            }

            for(int i=1;i<=m;i++){
                st = new StringTokenizer(bf.readLine(), " ");
                int v1 = Integer.parseInt(st.nextToken());
                int v2 = Integer.parseInt(st.nextToken());

                graph[v1].add(v2);

                pathNum[v2] += 1;
            }

            Queue<Node> q = new LinkedList<>();
            int[][] result = new int[n+1][2];
            // result[i][0] -> 값 , result[i][1] -> 개수

            for(int i=1;i<=n;i++){
                if(pathNum[i] == 0){
                    q.add(new Node(i,1)); // 들어오는 간선이 없는 정점 추가
                    result[i][0] = 1; // 1로 초깃값 설정
                    result[i][1] = 0;
                }
            }

            int answer = 0;

            while(!q.isEmpty()){
                Node cur = q.poll();

                for(int next : graph[cur.v]){

                    pathNum[next] -= 1;

                    if(result[next][0] < result[cur.v][0]){
                        result[next][0] = result[cur.v][0];
                        result[next][1] = 1; // 갱신
                    }else if(result[cur.v][0] == result[next][0]){
                        result[next][1] += 1; // 동일한 값일 경우 개수 1개 증가
                    }

                    if(pathNum[next] == 0){

                        int reNum = result[next][0];

                        if(result[next][1] > 1){
                            reNum += 1; // 개수가 2개 이상일 경우 값이 1 증가한다
                        }

                        result[next][0] = reNum;
                        q.add(new Node(next,result[next][0]));
                        answer = Math.max(answer,result[next][0]); // 최댓값
                    }
                }
            }

            sb.append(num+" "+answer+"\n");

        }

        System.out.print(sb);

        bf.close();
    }
}
class Node{
    int v;
    int c;

    Node(int v,int c){
        this.v = v;
        this.c = c;
    }
}