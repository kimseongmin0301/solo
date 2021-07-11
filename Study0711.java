/**
 * Study0711
 * 프로그래머스
 * 다음 큰 숫자
 */
public class Study0711 {

    public static void main(String[] args) {
        int n = 78;
        int answer = 0;
        String s = Integer.toBinaryString(n);
        int result = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1')
                result++;
        }
        
        while(true){
            int count = 0;
            String m = Integer.toBinaryString(++n);
            for(int i=0; i<m.length(); i++){
                if(m.charAt(i) == '1')
                    count++;
            }
            
            if(result == count){
                answer = n;
                break;
            }
        }

        System.out.print(answer);
    }
}