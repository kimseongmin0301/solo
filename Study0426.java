import java.util.HashMap;
import java.util.*;
public class Study0426 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1, hm.getOrDefault(1, 0) +1);					//hm 에 값넣기   .put(1,1이랑같으면동작X +1)
		hm.put(2, hm.getOrDefault(2, 0) +1);
		hm.put(2, hm.getOrDefault(2, 0) +1);
		hm.put(2, hm.getOrDefault(2, 0) +1);
		hm.put(2, hm.getOrDefault(2, 0) +1);
		hm.put(2, hm.getOrDefault(2, 0) +1);
		
		int index=0;
		int sum=0;
		for(Integer key:hm.keySet()) {
			if(hm.get(key)>sum) {
				sum=hm.get(key);
				index=key;
			}
			System.out.print(hm.get(key)+" ");
		}
		System.out.print("\n");
		System.out.println(hm);						// {1=1 , 2=5}
		System.out.println(sum);
		System.out.println(index);
	}

}
