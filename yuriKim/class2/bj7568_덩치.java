package java_study;

import java.util.Scanner;

public class bj7568_덩치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] arr = new int[T][2];
		int [] answer = new int[T];
		for(int i = 0; i<arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++) {
			int cnt = 1;
			for(int j = 0; j<arr.length; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					cnt++;
				}
			}System.out.print(cnt+ " ");
		}
		
		sc.close();
	}

}
