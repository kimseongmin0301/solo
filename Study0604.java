/**
 * Study0604
 * 
 * 프로그래머스 문자열을 정수로 바꾸기
 * https://programmers.co.kr/learn/courses/30/lessons/12925
 */
public class Study0604 {
    public static void main(String[] args) {
        String a = "1234";
        String b = "-1234";
        
        int answer = a.split("[1-9]").length > 0 ? Integer.parseInt(a):Integer.parseInt(a);
        int answer2 = b.split("[1-9]").length > 0 ? Integer.parseInt(b):Integer.parseInt(b);
         System.out.println(answer);
         System.out.println(answer2);
        }
    }  

