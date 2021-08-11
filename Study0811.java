/**
 * Study0811
 * 프로그래머스
 * 위클리 1주차 부족한 금액 계산하기
 */
public class Study0811 {

    public static void main(String[] args) {
        int price=3, money=20, count=4;

        int answer = 0;
        int sum = 0;

        for(int i=0; i<count; i++){
            sum += price;
            answer += sum;
        }
        
        if(answer - money > 0 )
            System.out.print(answer - money);
        else 
            System.out.print(0);
    }
}
        

