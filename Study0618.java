import java.util.Arrays;
/*
프로그래머스 
전화번호 목록
*/
public class Study0618 {
    public static void main(String[] args) {
        String[] p = {"119", "97674223", "1195524421"};
        boolean answer = true;
        Arrays.sort(p);
        for(int i=0; i<p.length-1; i++){
            if(p[i+1].startsWith(p[i])){
                answer = false;
                break;
            }
        }
        System.out.print(answer);
    }
}
