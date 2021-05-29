/*
프로그래머스 최댓값과 최솟값
https://programmers.co.kr/learn/courses/30/lessons/12939
*/
import java.util.Arrays;

public class Study0529 {

    public static void main(String[] args) {
        String s = "-4 -3 -2 -1"; 
        String [] a = s.split(" ");
        int [] q = new int[a.length];
        
        for(int i=0;i<a.length;i++){
             q[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(q);
     
       System.out.print(q[0] + " " + q[q.length-1]);
    }

}
