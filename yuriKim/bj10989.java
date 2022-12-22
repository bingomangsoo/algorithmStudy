package java_study;

import java.util.Scanner;

public class bj10989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test = 1; test<=T; test++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int result = 1;
			// 제곱하기위해 반복문 돌기 
			for(int i = 1; i<=num2; i++) {
				// 마지막 수만 구해서 거기에 계속 곱하기
				result = (result*num1)%10;
			}
			if(result ==0) {
				result = 10;
			}
			System.out.println(result);
		}
		
	}

}
