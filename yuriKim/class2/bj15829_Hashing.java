package java_study;

import java.math.BigInteger;
import java.util.Scanner;

public class bj15829_Hashing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int []arr = new int[num]; 
		String alpha = sc.next();
		for(int i = 0; i<arr.length;i++) {
			char a = alpha.charAt(i);
			arr[i] = ((int)a - 97) + 1;
		}
		int result = 0;
		int t = 31;
		for(int i = 0; i<arr.length;i++) {
			result += (int) (arr[i] * ((Math.pow(t, i)% 1234567891)));
		}
		System.out.println(result % 1234567891);
		sc.close();
	}
}
