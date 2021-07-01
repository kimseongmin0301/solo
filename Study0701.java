/**
 * Study0701
 * 프로그래머스
 * 최대공약수와 최소공배수
 */
public class Study0701 {

    public static void main(String[] args) {
        int n = 5;
        int m = 17;
        int[] answer = new int[2];
        int a = m * n;
        while(n!=0){
            int temp = m % n;
            m = n;
            n = temp;
        }
        answer[0] = m;
        answer[1] = a / m;
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]);
        }
    }
}