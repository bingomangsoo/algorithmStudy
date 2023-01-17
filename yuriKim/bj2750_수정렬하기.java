package java_study;

import java.io.*;
import java.util.Arrays;

public class bj2750_수정렬하기 {
    public static void main(String args []) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        for (int i = 0; i < total; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        for(int a : arr)
            bw.write(a + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
