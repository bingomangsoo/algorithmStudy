package java_study;

public class merge_sort {
	public static int [] arr;
	public static int [] temp;
	public static void main(String[] args) {
		arr = new int [] {2,1,8,0,7,5};
		temp = new int [arr.length];
		System.out.print("정렬 전 : ");
		printArray(arr);
		mergeSort(0, arr.length-1);
		System.out.println();
		System.out.print("정렬 후 : ");
		printArray(arr);
	}
	
	private static void mergeSort(int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			//재귀 시작
			mergeSort(start, mid);
			mergeSort(mid+1, end);
			
			int p = start;
			int q = mid+1;
			int idx = p;
			
			while(p <= mid || q <= end) {
				if(q > end || (p <= mid && arr[p] < arr[q])) {
					temp[idx++] = arr[p++];
				}else {
					temp[idx++] = arr[q++];
				}
			}
			for(int i = start; i<= end; i++) {
				arr[i] = temp[i];                           
			}
		}
	}
	// 현재 배열의 상태 출
	private static void printArray(int[] arr) {
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
