package java_study;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		int [] arr = {5,3,2,7,1};
		
		System.out.print("정렬 전 : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		bubbleSort(arr);
		
		System.out.print("정렬 후 : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

	private static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			// -i를 하는 이유 > 맨 마지막은 비교 안해도 됨
			for(int j = 0; j < arr.length-1-i; j++) { // 앞 숫자와 뒤 숫자 서로 비교할 반복문
				// j = 0일 때, arr[0] > arr[0+1]로 앞자리가 숫자가 더 크다면
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = tmp; 
				}
			}
			System.out.print(i+1+"번째 과정 : ");
			for(int x : arr)
				System.out.print(x+" ");
			System.out.println();
		}
	}
}
