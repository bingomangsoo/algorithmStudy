import java.util.Scanner;

public class bj2231_분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 0;
        for (int i=1; i<n; i++){
            int sum = 0;
            int a = i;
            while (a!=0){
                sum+= a%10;
                a/=10;
            }
            if(sum+i == n){
                m = i;
                break;
            }

        }
        System.out.println(m);

        // 다른 방법
        int a = 0;
        for (int i =1; i<n; i++){
            String str = String.valueOf(i);
            int sum = i;
            for (int j=0; j<str.length(); j++){
                sum +=  Integer.parseInt(String.valueOf(str.charAt(j)));
            }
            if (sum == n){
                a = i;
                break;
            }
        }
        System.out.println(a);


    }
}
