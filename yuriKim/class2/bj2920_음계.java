package java_study;

import java.util.Arrays;
import java.util.Scanner;

public class bj2920_음계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[8];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int result = 0;
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<=arr[j]) {
					result++;
				}else {
					result--;
				}
			}
		}
		if(result>0) {
			System.out.println("ascending");
		}else if(result<0) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		
		

	}

}
