package java_study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj2869_달팽이는올라가고싶다 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int up = Integer.parseInt(st.nextToken());
			int down = Integer.parseInt(st.nextToken());
			int goal = Integer.parseInt(st.nextToken());
			double result = 0;
			
			goal -= up;
			up -= down;
			result = Math.ceil((double)goal/up);
			System.out.println((int)(result+1));
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
