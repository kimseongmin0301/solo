/**
 * Study0710
 * 프로그래머스
 * 실패율 (보완해야함)
 */
import java.util.*;
public class Study0710 {

    public static void main(String[] args) {
        int N=5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = new int[N];
        ArrayList<Double> an = new ArrayList<>();
        Map<Integer,Double> map = new HashMap<>();
        double su = stages.length;
        int num = 0;
        for(int i = 1; i<=N; i++){
            for(int j=0; j<stages.length; j++){
                if(stages[j] == i)
                        num++;    
            } 
             an.add(num / su);
             su -= num;
             num = 0; 
        }

        for(int i = 1; i<=N; i++){
            map.put(i,an.get(i-1));
        }
        
        List<Integer> list = new ArrayList<Integer>(map.keySet());
		Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        answer = list.stream().mapToInt(i -> i).toArray();
        
        //출력
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}