import java.util.Scanner;

public class bj2588_곱셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int multi = n1*n2;

        while(n2!=0){
            System.out.println(n1*(n2%10));
            n2 = n2/10;
        }
        System.out.println(multi);
    }
}
