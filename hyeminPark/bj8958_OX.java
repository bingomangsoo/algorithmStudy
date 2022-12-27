import java.util.Scanner;

public class bj8958_OX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int j = 0; j < n; j++) {
            String str = sc.next();

            String[] arr = str.split("");

            int count = 0;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("O")) {
                    count++;
                    sum += count;
                    if (i > 0 && arr[i] == arr[i - 1]) {
                        count++;
                    }
                }
                if (arr[i].equals("X")) {
                    count = 0;
                }
            }
            count = 0;
            System.out.println(sum);
        }
    }
}
