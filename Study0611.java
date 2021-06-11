/**
 * Study0611
 * 프로그래머스 JadenCase 문자열 만들기
 */
import java.util.regex.Pattern;

public class Study0611 {
        public static void main(String[] args) {
        
            String s = "3people unFollowed me";
            String answer = "";
		
	        	s = s.toLowerCase(); // 모두 소문자로 바꾸기
	        	String[] tokens = s.split(" "); // 공백을 기준으로 단어 분리

	        	for (int i = 0; i < tokens.length; i++) {
		        	String str = tokens[i];
			
		        	if ("".equals(str)) { // 공백이 연속으로 입력될 경우
		        		answer += str;
		        	} else if (Pattern.matches("^[a-z]*$", str.substring(0, 1))) { // 첫 문자가 영문일 경우
		        		answer += str.substring(0, 1).toUpperCase() + str.substring(1);
		        	} else {
		        		answer += str;
		        	}
			
		        	if (i < tokens.length - 1)
	        			answer += " ";
	        	}
		
	        	if (" ".equals(s.substring(s.length()-1))) 
	        		answer += " ";

                System.out.print(answer);

    }
    
}