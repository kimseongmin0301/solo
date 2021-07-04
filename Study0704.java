import java.util.Arrays;

/**
 * Study0704
 * 프로그래머스
 * 예산
 */
public class Study0704 {

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
         int budget = 9;
        int answer = 0;
        int num = 0;
        Arrays.sort(d);
        for(int a : d){
            answer += a;
            if(answer > budget) break;
            num++;
        }
        System.out.print(num);    
    
    }
}