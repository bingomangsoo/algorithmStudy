import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String ex = bf.readLine();


        int cnt = 0;
        for(int i = 0; i < ex.length(); i++){
            if(ex.charAt(i) == ' '){
                cnt++;
            }
        }
        if(ex.charAt(0) != ' ' && ex.charAt(ex.length()-1) != ' '){ //첫 번째와 마지막이 공백이 아닌 경우
            cnt = cnt + 1;
        }
        if(ex.charAt(0) == ' ' && ex.charAt(ex.length()-1) == ' '){ //첫 번째와 마지막이 공백인 경우
            cnt = cnt - 1;
        }
        System.out.println(cnt);
    }
}
