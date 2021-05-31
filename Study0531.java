import java.util.Arrays;

/**
 * Study0531
 * 프로그래머스 문자열 내림차순으로 배치하기
 * https://programmers.co.kr/learn/courses/30/lessons/12917?language=java
 * 
 */

public class Study0531 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = "";
        String [] arr;
        arr = s.split("");
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0;i--){
           answer += arr[i];    
        }
       System.out.print(answer);   
    }
    
}
