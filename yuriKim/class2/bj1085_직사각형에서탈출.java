package java_study;

import java.util.Scanner;

public class bj1085_직사각형에서탈출 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
         
        int cnt1 = ((w-x)<x? (w-x) : x);
        int cnt2 = ((h-y)<y? (h-y) : y);
        
        if(cnt1<cnt2) {
        	System.out.println(cnt1);
        }else {
        	System.out.println(cnt2);
        }
	}
	}

