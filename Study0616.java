import java.util.ArrayList;

/**
 * Study0616
 * 프로그래머스 
 * 같은 숫자는 싫어
 */

public class Study0616 {

    public static void main(String[] args) {
        int b;
        int i = 0;
        int[] arr = {1,1,3,3,0,1,1};
        ArrayList<Integer> a = new ArrayList<>();

        while (i < arr.length) {
            a.add(arr[i]);
            b = arr[i];
            while ((i < arr.length) && (b == arr[i]))
                i++;
        }
        int[] answer = new int[a.size()];

        for(int j=0; j<a.size();j++){
            answer[j] += a.get(j);
            System.out.print(answer[j]);
        }
        
    }
}