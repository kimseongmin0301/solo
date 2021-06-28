import java.util.HashSet;

/**
 * Study0628
 * 프로그래머스
 * 폰켓몬
 */
public class Study0628 {

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        int answer = 0;
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            
            if(set.size() < nums.length / 2)
                answer = set.size();
            else
                answer = nums.length/2;
        }
        System.out.print(answer);
    }
}