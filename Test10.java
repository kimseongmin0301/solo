import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        int [] l1 = {2,4,3};
        int [] l2 = {5,6,4};
        String num = "";
        String num2 = "";
        
        int sum = 0;
        int sum2 = 0;
        int answer = 0;
        
        for(int i=l1.length-1; i>=0; i--){
            num += String.valueOf(l1[i]);
            num2 += String.valueOf(l2[i]);
        }
        
        sum = Integer.parseInt(num);
        sum2 = Integer.parseInt(num2);
        
        answer = sum + sum2;
        String result = Integer.toString(answer);
        String[] a = result.split("");
        ArrayList<String> q = new ArrayList<>();

        for(int i=0; i<a.length; i++){
            q.add(a[i]);
        }
        Collections.reverse(q);
        for(int i=0; i<a.length; i++){
            a[i] = q.get(i);
        }
        int[] output = new int[a.length];
        for(int i = 0; i<a.length; i++){
            output[i] = Integer.parseInt(a[i]);  
       }
        
    }
}
