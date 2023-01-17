package java_study;

import java.util.Scanner;

public class bj2588_곱셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = num2;
		
		for(int i = 0; i<3; i++) {
			int num4 = num3%10; // num2 = num2 % 10
			num4 = num1*num4;
			System.out.println(num4);
			num3/=10;
			// 1의 자리수 구하
		}System.out.println(num1*num2);
	}

}
