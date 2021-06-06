/**
 * Study0606
 * 프로그래머스 음양더하기
 * https://programmers.co.kr/learn/courses/30/lessons/76501
 */
public class Study0606 {
    public static void main(String[] args) {
        int answer = 0;
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true}; 
        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == true)
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }

        System.out.print(answer);
    }
    
}