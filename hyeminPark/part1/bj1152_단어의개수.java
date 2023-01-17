import java.util.Scanner;

public class bj1152_단어의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String [] arr = str.split(" ");

        int count = 0;
        for (String a : arr){
            if (a.equals("")){
                count++;
            }
        }
        System.out.println(arr.length-count);
    }
}
