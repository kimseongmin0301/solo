/**
 * Study0610
 * 프로그래머스
 * 이상한 문자 만들기
 */
public class Study0610 {

    public static void main(String[] args) {
        String s = "try hello world";
        String answer = "";
        String[] m = s.split("");
        int a = 1;
        for(int i=0; i<m.length; i++){
            if(m[i].equals(" ")){
                a = 1;
                answer += " ";
                continue;
            }
            if(a % 2 == 1)
                answer += m[i].toUpperCase();
            else
                answer += m[i].toLowerCase();
            
            a++;
        }
              System.out.print(answer);
        }
    }
