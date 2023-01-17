package java_study;

public class Selection_sort {

	public static void main(String[] args) {
		int [] arr = {2,4,6,1,3,9,5};
		System.out.print("정렬 전 : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		SelectionSort(arr);
		System.out.print("정렬 후 : ");
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

	private static void SelectionSort(int[] arr) {
		for(int i = 0; i<arr.length-1;i++) {
			// 최솟값 인덱스 찾아서 저장
			int min_index = i;
			for(int j = i+1; j< arr.length; j++) {
				if(arr[j]<arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
			
			System.out.print(i+1+"번째 과정 : ");
			for(int x : arr)
				System.out.print(x+" ");
			System.out.println();
		}
		
	}

}
