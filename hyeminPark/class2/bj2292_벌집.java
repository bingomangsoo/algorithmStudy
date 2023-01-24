import java.util.Scanner;

public class bj2292_벌집 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int count = 1;
        while(x < n){
            x = x+6*count;
            count++;
        }
        System.out.println(count);

    }
}
