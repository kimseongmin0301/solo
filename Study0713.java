/**
 * Study0713.java
 * https://leetcode.com/problems/two-sum/
 * LeetCode  - two sum
 */
public class Study0713{

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = new int[2];
        int count = 0;
                
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                 if(nums[i] + nums[j+1] == target){
                     if(i == j+1)
                     continue;
                    result[0] = i;
                    result[1] = j+1;
                    count++;
                    break;
                }
            }
            if(count == 1)
                break;
        }

        System.out.print(result[0] + " ");
        System.out.print(result[1]);
    }
}