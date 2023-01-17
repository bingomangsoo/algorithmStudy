import java.util.Scanner;

public class bj1009_분산처리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int result = n1;

            for (int j=0; j<n2-1; j++){
                result = result*n1%10;
            }
            if (result%10 ==0){
                System.out.println(10);
            }else {
                System.out.println(result % 10);
            }
        }

    }
}
