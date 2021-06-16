/**
 * Test3
 */
import java.util.*;
public class Test3 {

    public static void main(String[] args) {
      HashSet<Integer> hs = new HashSet<Integer>();
      int[] a = {4,4,3,3,2,2,1,1};

      for(int i=0; i<a.length; i++){
          hs.add(a[i]);
      }
     // System.out.println(hs);

      HashMap<String,Integer> hm = new HashMap<>();

      String[] ha = {"a","b","c","e","d"};

      for(int i=0; i<ha.length; i++){
        hm.put(ha[i],i);
      }
      
    //  System.out.println(hm.keySet());
    
      List<String> list = new ArrayList<>(hm.keySet());
      Collections.sort(list);

      List<Integer> answer = new ArrayList<>();
      for(String s: list){
          answer.add(hm.get(s));
      }

      System.out.println(list);
      System.out.println(hm.get("d"));
      System.out.println(answer);


    }
}
