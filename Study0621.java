/**
 * Study0621
 * 프로그래머스
 * 문자열 내 마음대로 정렬하기
 */
import java.util.Arrays;
public class Study0621 {

    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] answer = new String[strings.length];
        
        for(int i=0; i<strings.length; i++){
            answer[i] = strings[i].substring(n,n+1)+strings[i];
        }
        Arrays.sort(answer);
        for(int i=0; i<strings.length;i++){
            answer [i] = answer[i].substring(1);
            System.out.print(answer[i]);
        }
    }
}