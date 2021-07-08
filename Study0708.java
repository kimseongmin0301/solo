import java.util.Arrays;
import java.util.Comparator;

/**
 * Study0708
 * 프로그래머스
 * 가장 큰 수
 */
public class Study0708 {

    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        String[] nums = new String[numbers.length];

        for (int i=0; i<nums.length; i++) 
            nums[i] = numbers[i] + "";

        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        String ans = "";
        for (int i=0; i<numbers.length; i++)
            ans += nums[i];

        if(ans.charAt(0) == '0')
            System.out.print("0");
        else   
            System.out.print(ans);
        
    }
}