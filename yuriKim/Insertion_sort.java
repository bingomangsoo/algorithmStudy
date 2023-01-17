package java_study;

public class Insertion_sort {

	public static void main(String[] args) {
		int [] arr = {3,2,4,1,6,5};
		System.out.print("정렬 전 : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		insertion(arr);
		System.out.print("정렬 후 : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}

	}

	private static void insertion(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			// 정렬할 대상  
			int change = arr[i];
			
			// 이전 원소 
			int j = i - 1;
			
			// 정렬할 대상이 이전 원소보다 크기 전 까지 반복
			while(j>=0 && change < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			// 위 while문을 탈출하는 경우는 이전 원소가 정렬할 대상 원소보다 적다는 의미로
			// 정렬할 대상 원소는 이전 원소의 뒤에 와야한다.
			// 그러므로 정렬할 대상은 j+1에 위치하게 된다ㅏ
		
			arr[j+1] = change;
			System.out.print(i+"번째 정렬 : ");
			for(int x : arr) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
