public class counting_sort {
    public static void main(String[] args) {
        int [] arr = {2,1,5,6,12,5,8,1,2,0,
                      8,15,3,2,5,1,1,12,1,0,
                      7,8,15,13,1};

        int max = 0;
        for (int x : arr){ // 배열에서 최댓값 구하기
            if (x > max){
                max = x;
            }
        }

        int [] counting = new int[max+1]; // 0~최댓값 까지의 범위
        
        for (int i =1; i<arr.length-1; i++){
            counting[arr[i]]++; // 배열에서 숫자가 몇 번 나오는지 개수를 센다.
        }

        for (int i =1; i<counting.length-1; i++){
            if (counting[i] !=0){ // 개수가 0이 아닌 배열 나열하기
                for (int j=0; j<counting[i]; j++){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
