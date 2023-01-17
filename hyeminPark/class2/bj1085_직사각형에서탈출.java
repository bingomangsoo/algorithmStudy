import java.util.Arrays;
import java.util.Scanner;

public class bj1085_직사각형에서탈출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int [] arr = {n1-0, n2-0, n3-n1, n4-n2};

        Arrays.sort(arr);

        System.out.println(arr[0]);


    }
}
