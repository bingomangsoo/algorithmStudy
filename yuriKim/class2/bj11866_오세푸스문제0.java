package java_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bj11866_오세푸스문제0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> list = new ArrayList();
		List<Integer> result = new ArrayList(); // 결과용

		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		int cnt = 0;// 0번 부터 출발하니깐 0으로 지정
		k--;
		while (!(list.isEmpty())) {
			cnt += k;
			cnt = cnt % list.size();
			int num = list.remove(cnt);
			result.add(num);
		}

		System.out.print("<");
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
			if (i != result.size() - 1)
				System.out.print(", ");
		}
		System.out.println(">");
	}

}
