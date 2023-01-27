package java_study;

import java.util.Scanner;

public class bj1259_팰린드롬수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next();
			String T = "";
			if(str.equals("0")) {
				break;
			}
			for(int i = 0; i< str.length(); i++) {
				T += str.charAt(str.length()-1-i);
			}
			if(str.equals(T)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}
