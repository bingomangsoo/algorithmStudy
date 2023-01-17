import java.util.Scanner;

public class bj2675_문자열반복 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        for (int j = 0; j < n; j++) {
            String str = sc.nextLine();

            String [] a = str.split(" ");

            int num = Integer.parseInt(a[0]);

            String [] arr = a[1].split("");


            for (String b : arr){
                System.out.print(b.repeat(num));
            }
            System.out.println();

        }
    }
}