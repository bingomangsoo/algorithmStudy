package java_study;

import java.util.Scanner;

public class bj2292_벌집 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 1; //1바퀴 
		int test = 2; //초기 2~7까지 
		
		if(num == 1) {
			System.out.println(cnt);
		}else {
			while(test <= num) {
				test = test + (cnt * 6);
				cnt++;
			}
			System.out.println(cnt);
		}
	}

}
