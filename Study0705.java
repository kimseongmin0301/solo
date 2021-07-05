/**
 * Study0705
 * 프로그래머스
 * 소수만들기 level 1
 */
public class Study0705 {
    static int[] nums = {1,2,7,6,4};
    public static void main(String[] args) {
        int answer = 0;
        int sum = 0;
        boolean chk = false;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(sum >= 2)
                        chk = sosu(sum);   
                    if(chk)
                        answer++; 
                }
            }
        }

        System.out.print(answer);
    }

    public static boolean sosu(int sum){
        boolean check = true;
        if(sum == 2)
            return check; 
        for(int z = 2; z < sum; z++){
            if(sum % z == 0){
                check = false;
                break;
            }
        }
        return check;
    }

    
}