import java.util.Scanner;

public class bj11050_이항계수1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [][] arr = new int[n+1][k+1];

        System.out.println(recall(n,k,arr));


    }
    public static int recall(int n, int r, int[][] arr){
        if (r == 0 || n==r){
            arr[n][r] = 1;
        }else {
            arr[n][r] = recall(n-1,r-1,arr) + recall(n-1,r,arr);
        }
        return arr[n][r];
    }
}
