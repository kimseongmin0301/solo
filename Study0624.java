/**
 * Study0624
 * 프로그래머스
 * 이진 변환 반복하기
 */
public class Study0624 {
    static String s = "110010101001";
    public static void main(String[] args) {
        int[] answer = new int [2];
        int zero = 0;
        int x = 0;
        while(!s.equals("1")){
            int count = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '1')
                    count++;
                else
                    zero++;
            }
            s = Integer.toBinaryString(count);
            x++;
        }
        answer[0] = x;
        answer[1] = zero;

        //출력
        System.out.print("[");
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]);
            if(i==0)
            System.out.print(",");
        }
        System.out.print("]");
    }
}