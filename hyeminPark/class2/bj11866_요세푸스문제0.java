package commit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bj11866_요세푸스문제0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder("<");

        for (int i =1; i<=n; i++){
            queue.add(i);
        }
        while (queue.size()!=1){
            for (int i=0; i<k-1; i++){
                queue.add(queue.poll());
            }
            sb.append(queue.poll()+", ");
        }
        sb.append(queue.poll()+">");
        System.out.println(sb);
    }
}
