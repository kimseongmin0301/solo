import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
      
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
        return answer;
  }
}