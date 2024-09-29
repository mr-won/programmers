import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		
		// 처리시간이 빠른 사람 순서대로 정렬.
		Arrays.sort(a);
		
	
		int sum = a[0];
		
		
		for(int i=1;i<n;i++) {
			a[i] += a[i-1];
			sum+=a[i];
		}
		
		System.out.println(sum);
		in.close();
	}

}