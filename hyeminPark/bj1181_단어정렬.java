import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class bj1181_단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String [] arr = new String[n];
        int [] leng = new int[n];

        for (int i =0; i<n; i++){
            arr[i] = br.readLine();
        }

        for (int i =0; i<n; i++){
            leng[i] = arr[i].length();
        }
        Arrays.sort(arr);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));




        for (String a : set){
            System.out.println(a);
        }

    }
}
