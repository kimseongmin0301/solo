/**
 * Study0718
 * 프로그래머스
 * 숫자의 표현
 */
public class Study0718 {
    public static boolean sum(int a, int b){
        int sum = 0;
        while(sum < a){
            sum += b;
            b++;
        }
        if(sum == a)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int n = 15;
        int answer = 1; 
        for(int i=1; i<=n/2; i++){
            if(sum(n,i))
                answer++;
        }
        System.out.print(answer);
    }
}