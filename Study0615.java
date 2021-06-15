/**
 * Test7
 * 프로그래머스
 * 완주하지 못한 선수
 */
import java.util.*;
public class Study0615 {

    public static void main(String[] args) {
        String answer = "";
        String[] participant ={"leo", "kiki", "eden"};
        String[] completion ={"eden", "kiki"};

        HashMap<String,Integer> pt= new HashMap<>();        

        for(String s : participant){
            pt.put(s,pt.getOrDefault(s,0)+1);
        }
        for(String s : completion){
            pt.put(s,pt.getOrDefault(s,0)+1);
        }

        for(String key : pt.keySet()) {
            if(pt.get(key)%2 == 1) {
                answer = key;
            }
        }
        System.out.print(answer);
    }
}