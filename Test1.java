import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {	
    public static void main(String[] args){
			String[] input = {"C","E", "B", "A", "D"};
	
			Map<String, Integer> hm = new HashMap<>();  
			for(int i=0; i<input.length; i++){
				hm.put(input[i], i);
			}
	
			List<String> list = new ArrayList<>(hm.keySet());
			Collections.sort(list);
	
			List<Integer> answer = new ArrayList<>();
			for(String s: list){
				answer.add(hm.get(s));
			}
			System.out.println(hm);
			System.out.println(list);
			System.out.println(answer);
	
    }
}