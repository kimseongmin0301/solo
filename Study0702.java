import java.util.TreeSet;

/**
 * Study0702
 * 프로그래머스
 * 두 개 뽑아서 더하기
 */
public class Study0702 {

    public static void main(String[] args) {
        TreeSet<Integer> answer = new TreeSet<Integer>();
        int[] numbers = {2,1,3,4,1};
      
       for(int i=0; i<numbers.length;i++){
           for(int j=i+1; j<numbers.length;j++){
              answer.add(numbers[i] + numbers[j]);
           } 
       }
       System.out.print(answer);
    }
}