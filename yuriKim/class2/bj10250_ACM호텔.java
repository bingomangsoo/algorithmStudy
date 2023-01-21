package java_study;

import java.util.Scanner;

public class bj10250_ACM호텔 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {	
			int h = sc.nextInt();
			int w = sc.nextInt(); 
			int n = sc.nextInt();
			int result = 0 ;
			
			if(n % h == 0) {
				result = (h * 100) + (n/h);
			} else {
				result = ((n % h) * 100) + ((n/h) + 1);
			}
			System.out.println(result);
		}
	}
}

