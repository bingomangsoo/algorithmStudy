package java_study;

import java.io.*;
import java.util.Arrays;

public class bj10989_수정렬하기3 {
	 static int[] arr = new int[10003];

	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        for(int i = 0; i < n; ++i) {
	            int num = Integer.parseInt(br.readLine());
	            ++arr[num];
	        }
	        StringBuilder sb = new StringBuilder();
	        for (int i = 1; i <= 10000; ++i) {
	            for (int j = 0; j < arr[i]; ++j) {
	                sb.append(i).append("\n");
	            }
	        }
	        System.out.println(sb);
	    }
}
