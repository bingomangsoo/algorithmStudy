package java_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj1978_소수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i<=T; i++) {
			int num = sc.nextInt();
			//소수는 자신이랑 1로만 나눠지는 것
			
			for(int j = 2; j<=num; j++) {
				if(num!=1 && num==j) {
					result++;
				}
				if(num%j==0) { 
					break;
				}
			}
		}System.out.println(result);
	}

}
