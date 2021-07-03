import java.util.Stack;

/**
 * Study0703
 * 프로그래머스
 * 짝지어 제거하기
 */
public class Study0703 {

    public static void main(String[] args) {
        String s = "baabaa";
        int answer = 0;
        Stack<Character> a = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(!a.isEmpty() && a.peek() == c)
                a.pop();
            else
                a.push(c);
        }
        answer = a.isEmpty() ? 1 : 0;
        
        System.out.print(answer);
    }
}