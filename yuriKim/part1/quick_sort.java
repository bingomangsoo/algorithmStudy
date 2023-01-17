package java_study;

public class quick_sort {
    private static int arr[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
    private static int number = arr.length;

    public static void main(String[] args) {
        quickSort(arr, 0, number-1);
        show();
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = start;
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j) { // 엇갈릴 때 까지 반복 j가 i보다 크거나 같으면 while문 종료
            while (i <= end && arr[i] < arr[pivot]) { // 피벗 값보다 큰 값을 만날 때 까지
                i++;
            }
            while (j > start && arr[j] >= arr[pivot]) { // 피벗 값보다 작은 값을 만날 때 까지
                j--;
            }
            if (i > j) { // 현재 엇갈린 상태라면
                temp = arr[j];
                arr[j] = arr[pivot];
                arr[pivot] = temp;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        quickSort(arr, start, j-1);
        quickSort(arr, j+1, end);
    }

    public static void show() {
    	System.out.print("결과 : ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
