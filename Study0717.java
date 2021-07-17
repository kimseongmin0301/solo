import java.util.Arrays;

/**
 * Study0717
 * 프로그래머스
 * 최솟값 만들기
 */
public class Study0717 {

    public static void main(String[] args) {
        int answer = 0;
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<A.length;i++){
            answer += A[i]*B[B.length-i-1];
        }

        /출력
        System.out.print(answer);
    }
}