import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int [] arr = {3,2,5,7,1,9,6,8,4};

        for (int i =1; i<arr.length; i++){
            int target = arr[i]; // 타겟 원소
            int prev = i-1; // 타켓 이전 인덱스

            while(prev >=0 && arr[prev] > target){ // 타겟 이전 원소부터 인덱스 0의 원소까지 모두 비교
                arr[prev+1] = arr[prev];
                prev--; // 
            }
            arr[prev+1] = target;
        }
        System.out.println(Arrays.toString(arr));
    }
}
