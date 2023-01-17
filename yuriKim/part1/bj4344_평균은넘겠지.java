package java_study;

import java.util.Scanner;

public class class4344_평균은넘겠지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	 
		for(int T_case = 1; T_case<=T; T_case++) {
			
			int cnt = sc.nextInt();
			float avg = 0; 
			int hap = 0;
			float per =0;
			float avg2  =0;
			
			//	수 입력받
			int [] arr = new int [cnt];
			for(int i = 0; i < cnt; i++) {
				arr[i] = sc.nextInt(); 
				hap+=arr[i];
			}
			//평균  
			avg = (float)hap/cnt;
			
			for(int i = 0; i<cnt; i++) {
				//해당 점수가 평균보다높다면? 
				if(arr[i]>avg) {
					per++;
				}
			}
			
			avg2 = per/cnt;
			System.out.println(String.format("%.3f", avg2*100)+"%");
	} 
}
}
