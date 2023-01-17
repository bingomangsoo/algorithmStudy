import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 2588번 곱셈
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// 풀이방법1. 단순 출력 (세자리 수 x 세자리 수일때만 가능)
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * (num2 % 100 / 10));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
		
		// 풀이방법2. 반복문을 통한 풀이(자리 수와 상관 없음)
		int result = num1 * num2; // 총합 구하기
		
		while(num2 != 0) { // 자리수에 따라 계속 나눗셈하기
			System.out.println(num1 * (num2 % 10));
			num2 /= 10;
		}
		System.out.println(result); // num1 * num2
		
		
		
	}
}
