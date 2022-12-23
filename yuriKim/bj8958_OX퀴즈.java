package java_study;

import java.util.Scanner;

public class class8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int T_case = 1; T_case<=T; T_case++) {
			String str = sc.next();
			int jum = 0;
			int hap = 0;
			for(int i = 0; i<str.length(); i++) {
				if(str.charAt(i)=='O') {
					jum++;
					hap+=jum;
				}else {
					jum=0;
				}
			}System.out.println(hap);
		}

	}

}
