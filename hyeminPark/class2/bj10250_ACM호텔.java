import java.util.Scanner;

public class bj10250_ACM호텔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i=0; i<test; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int x = n % h;

            int y = n/h+1;

            if(x ==0){
                System.out.println(h*100+n/h);
            }else{
                System.out.println(x*100+y);
            }
        }

    }
}
