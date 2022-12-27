package ex01;

import java.util.Scanner;

public class y01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test_case = sc.nextInt(); // test_case

		for (int i = 0; i < test_case; i++) {
			
			// 학생 수 입력
			int stu = sc.nextInt();
			
			// 학생 점수보관할 배열 생성
			int[] score = new int[stu];
			
			// 점수 총합
			int result = 0;
			
			// 평균 넘는애 수
			int cnt = 0;
			
			for(int j = 0; j < stu; j++) { // 학생 점수 입력 및 학새 점수 합계 구하기
				score[j] = sc.nextInt();
				result += score[j];
			}
			
			for(int j = 0; j < stu; j++) { // 평균 넘는 학생 수 확인
				if(score[j] > result / (double)stu) {
					cnt++;
				}
			}
			System.out.println(String.format("%.3f", (double)cnt / (double)stu * 100)+"%"); // 값 도출
			
		}

	}
}
