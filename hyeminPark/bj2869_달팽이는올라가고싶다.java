import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj2869_달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] arr = br.readLine().split(" ");

        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);
        int n3 = Integer.parseInt(arr[2]);

        int x = n3 - n1;
        int y = n1 - n2;

        System.out.println((long)(Math.ceil(x/(double)y))+1);
    }
}
