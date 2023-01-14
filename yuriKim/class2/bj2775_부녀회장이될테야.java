package java_study;

import java.util.Scanner;

public class bj2775_부녀회장이될테야 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i<T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int [][] arr = new int [k+1][n];
			int depth = 1;
			
			for(int p = 0;p <=k;p++) { //층 
				for(int q = 1;q<n;q++) { //호 
					for(int z = 1;z<n; z++) {
						if(z == n){
							arr[p][q] = z+depth;
							depth++;
							break;
						}
						if(z == 1) {
							arr[p][q] = 1;
						}else {
							arr[p][q] = z+depth;
						}
					}
				}
			}	
		}
	}
}
