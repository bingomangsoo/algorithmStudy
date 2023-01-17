package java_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bj2309_일곱난장이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int [] arr2 = new int[9];
		// 9개 총
		int hap = 0;
		int a = 0;
		int b = 0;
		// 리스트에 값 추
		for (int i = 0; i < 9; i++) {
			arr.add(i, sc.nextInt());
			hap += arr.get(i);

		}
		// 2개씩 빼면서 비
			for (int i = 0; i < 8; i++) { // 0 1 2 3 4 5 6 7 8 
				for (int j = i + 1; j <9; j++) { // 1 2 3 4 5 6 7 8 9
					if (hap - arr.get(i) - arr.get(j) == 100) {
						a = i;
						b = j;
						//정렬
						break;
					}
				}
			}
			
			arr.remove(a);
			arr.remove(b);
			Collections.sort(arr);
			for(int p = 0; p<arr.size();p++) {
				System.out.println(arr.get(p));
				}
	}
}
	
