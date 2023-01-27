import java.util.HashMap;
import java.util.Scanner;

public class bj15829_Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i =1; i<27; i++){
            map.put((char)(96+i),i);
        }


        int sum =0;
        for (int i =0; i<L; i++){
            sum+=map.get(str.charAt(i)) * Math.pow(31,i);
        }
        System.out.println(sum);


    }
}
