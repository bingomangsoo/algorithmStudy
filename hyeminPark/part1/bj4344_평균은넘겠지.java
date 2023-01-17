import java.util.Scanner;

public class bj4344_평균은넘겠지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        for (int i=0; i<n1; i++){
            int n2 = sc.nextInt();
            int [] arr = new int[n2];

            int sum = 0;
            for (int j=0; j<n2; j++){
                int n3 = sc.nextInt();
                arr[j] = n3;
                sum+= n3;
            }

            int count = 0;
            for (int x : arr){
                if (x > sum/n2) {
                    count++;
                }
            }

            System.out.print(String.format("%.3f", count/(double)n2*100));
            System.out.println("%");

        }
    }
}
