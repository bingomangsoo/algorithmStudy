import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		int n = Integer.parseInt(br.readLine());
		
		BigInteger count = new BigInteger("2");
        //주의!!) n이 100인 경우 long의 범위를 넘어간다
        // 이동 횟수 구하는 알고리즘
        System.out.println(count.pow(n).subtract(new BigInteger("1")));
		
		if (n<=20) { 
            hanoi(n, 1, 3, 2);
        }		
	}
	// n = 원판의 개수, start - 시작기둥, goal - 목표기둥, assist - 보조기둥
	public static void hanoi(int n, int start, int goal, int assist) {
		
		if(n == 1) {
			System.out.println(start +" " + goal);
			return;
		}
		hanoi(n-1, start, assist, goal); // n - 1개의 원판들 보조기둥으로 이동
		System.out.println(start+" "+goal); // 가장 큰 원판 목표기둥으로 이동
		hanoi(n-1, assist, goal, start); // n -1 개의 보조기둥에있는 원판들 목표로 다시 이동
		
	}
}
