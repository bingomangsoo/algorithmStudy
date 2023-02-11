package java_study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bj10814_나이순정렬 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[][]arr = new String[T][2];
		for(int i = 0; i<T; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		Arrays.sort(arr, new Comparator<String[]>() {
   	 		@Override
   	 		public int compare(String[] s1, String[] s2) {
   	 		if(s1[0] == s2[0]) {
   	 			return 1;
   	 		}else {
   	 			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
   	 		}
   	 	}
   	 	});
   
   	 	
   	 	for(int i = 0; i < T; i++) {
			System.out.println(arr[i][0] +" "+ arr[i][1]);
   	 		}
}
}