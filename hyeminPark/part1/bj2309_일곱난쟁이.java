import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj2309_일곱난쟁이 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[9];

        int sum =0;
        int count =0;
        for (int i =0; i<9; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum+=arr[i];
        }


        for (int i =0; i<8; i++){
            for (int j=i+1; j<9; j++){
                if(count ==1){
                    break;
                }
                if (sum - (arr[i]+arr[j]) == 100){
                    arr[i] =0;
                    arr[j] =0;
                    count++;

                }
            }
        }
        Arrays.sort(arr);
        for (int x: arr){
            if (x !=0){
                System.out.println(x);
            }
        }
    }
}
