import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int answer = 0;
        for(int i=666;;i++){
            if((i+"").contains("666")){
                count++;
            }
            if(count == N){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}