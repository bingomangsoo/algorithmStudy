import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bj2751_수정렬하기2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> arr= new ArrayList<>();

        for (int i =0; i<n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (Integer x : arr){
            sb.append(x+"\n");
        }
        System.out.println(sb);

    }
}
