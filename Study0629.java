import java.util.Arrays;

/**
 * Study0629
 * 프로그래머스
 * H-Index
 */
public class Study0629 {

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        int answer = 0;

        Arrays.sort(citations);
        int ans = 1;
        for(int i = citations.length -1; i>=0; i--){
            if(ans <= citations[i]){
                answer = ans;
            }
            ans++;
        }
        System.out.print(answer);
       
    }
}