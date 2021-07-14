/**
 * Study0710
 * 프로그래머스
 * 실패율
 */
import java.util.*;
public class Study0710 {

    public static void main(String[] args) {
        int N=5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = new int[N];
        Map<Integer,Double> an = new HashMap<>();

        double length = stages.length;
        double val = 0;

        for(int i = 1; i<=N; i++){
            double num = 0;
            for(int j=0; j<stages.length; j++){
                if(stages[j] == i)
                        num++;    
            } 
            val = num/length;
            if(length==0)
                val = 0;
             an.put(i,val);
             length -= num;
        }

        List<Integer> list = new ArrayList<Integer>(an.keySet());
        Collections.sort(list, (o1, o2) -> (an.get(o2).compareTo(an.get(o1))));

        for(int i=0; i<N; i++){
            answer[i] = list.get(i);
        }
        
        //출력
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}