package java_study;

import java.util.HashSet;
import java.util.Scanner;

public class bj3052_나머지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i<10; i++) {
			int num = sc.nextInt()%42;
			set.add(num);
		}
			System.out.println(set.size());
		
	}

}
