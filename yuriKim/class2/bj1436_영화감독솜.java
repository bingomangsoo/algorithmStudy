package java_study;

import java.util.Scanner;

public class bj1436_영화감독솜 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int num = 666;
			int count = 1;
	  
			while(count != N) {
				num++;
				System.out.println(num);
				if(String.valueOf(num).contains("666")) {
					count++;
				}
			}
			System.out.println(num);
		}
	}
