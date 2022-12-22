import java.util.Scanner;

public class bj10989_수정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i<num; i++){
            String input = sc.nextLine();

            int n1 = Integer.parseInt(input.split(" ")[0]);
            int n2 = Integer.parseInt(input.split(" ")[1]);

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
