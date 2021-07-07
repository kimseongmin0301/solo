/**
 * Study0707
 * 괄호변환
 * 프로그래머스 ( 조건은 안맞지만 바뀌긴함 )
 */
public class Study0707 {

    public static void main(String[] args) {
        String p = "))((()))((()";
        String answer = "";
        String a = p;
        String b = "";
        
        
        for(int i=0; i<p.length(); i++){
                a = a.replace("()","");       
                if(a.equals(""))
                    System.out.print(p);                         
        }
        char[] data = a.toCharArray();
        for(int i=0; i<data.length; i++){
            if(data[i] == '(')
                data[i] = ')';
            else
                data[i] = '(';
            
            b += data[i];
        }
        answer = p.replace(a,b);
        
        System.out.print(answer);
    }
}