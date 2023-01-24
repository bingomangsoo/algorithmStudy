import java.util.Scanner;

public class bj2798_블랙잭 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr [] = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int min = m;
        int result = 0;
        for (int i=0; i<n-2; i++){
            for (int j =i+1; j<n-1; j++){
                for (int k =j+1; k<n; k++){
                    int a = arr[i]+arr[j]+arr[k];
                    if (m - a <=min && a <=m){
                        min = m-a;
                        result = a;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
