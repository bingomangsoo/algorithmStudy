import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {

        int min_index;
        int [] arr = {3,1,6,5,8,9,4,2};
        for (int i = 0; i < arr.length - 1; i++) {
            min_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
