/**
 * Study0619
 * 프로그래머스
 * 콜라츠 추측
 */
public class Study0619 {

    public static void main(String[] args) {
        int answer = 0;
        int a = 6;
        long n = a;
        
       while(n != 1){
            if(n%2==0)
                n=n/2;
            else
                n=n*3+1;
           
           answer++;
           
           if(answer > 500)
               answer = -1;
        }
            System.out.print(answer);
    }
}