import java.util.ArrayList;

/**
 * Study0625
 * 프로그래머스
 * 모의고사
 */
public class Study0625 {

    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int one1 = 0; int two2 = 0; int three3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(one[i % one.length] == answers[i])
                one1++;
            if(two[i % two.length] == answers[i])
                two2++;
            if(three[i % three.length] == answers[i])
                three3++;   
        }
        
        int max = Math.max(Math.max(one1,two2),three3);
        
        ArrayList<Integer> a = new ArrayList<>();
        
        if(one1 == max)
            a.add(1);
        
        if(two2 == max)
            a.add(2);
        
        if(three3 == max)
            a.add(3);
        
        int[] answer = new int[a.size()];
        for(int i=0; i<a.size(); i++){
            answer[i] = a.get(i);
        }

        //출력
        System.out.print("[");
        for(int i=0; i<answer.length; i++){ 
            System.out.print(answer[i]);
            if(i != answer.length-1)
                System.out.print(",");
        }
        System.out.print("]");
    }
}