/**
 * Study0627
 프로그래머스
 자릿수더하기
 */
public class Study0627 {

    public static void main(String[] args) {
        int n =123;
        int answer = 0;
        String a = Integer.toString(n);
        String[] b = new String[3];
        b = a.split("");
        for(int i=0; i<b.length ; i++){
            answer += Integer.parseInt(b[i]);
        }
        System.out.print(answer);
    }
}