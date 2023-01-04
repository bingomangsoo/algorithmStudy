import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n]; // n = 5라고 가
		
		for(int i = 0; i < n; i++) { 
 			arr[i] = Integer.parseInt(br.readLine()); // 1 2 5 4 3
		}
		
		for(int i = 0; i < n - 1; i++) { // i = 0 ~ 3 맨앞짜리에서부터 비교 시
			for(int j = i + 1; j < n; j++) { // j = i+n ~ 4 
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int arrs : arr) {
			System.out.println(arrs);
		}
		
	}
}
