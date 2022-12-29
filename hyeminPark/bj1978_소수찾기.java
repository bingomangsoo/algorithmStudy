import java.util.Scanner;

public class bj1978_소수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int count = 0;
        for (int i =0; i<n; i++){
            int num = sc.nextInt();

            int count2 = 0;
            for(int j =1; j<=num; j++){
                if(num%j == 0){
                    count2++;
                }
            }
            if(count2++ == 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
