package java_study;

import java.util.Scanner;

public class bj2675 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for(int test = 1; test<=T; test++) {
				int num = sc.nextInt();
				String str = sc.next();
				
				//입력받은 문자열 길이만큼 반복
				for(int i = 0;i<str.length(); i++) {
					//앞 문자부터 잘라서 result에 입력 
					String result = str.substring(i,i+1);
					//result 단어를 num만큼 반복 
					System.out.print(result.repeat(num));
				}
				System.out.println();
			}
			
		}

	}

