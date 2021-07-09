/**
 * Study0709
 * 프로그래머스
 * 숫자 문자열과 영단어
 */
public class Study0709 {

    public static void main(String[] args) {
        String s = "one4seveneight";
        int answer = 0;
        String[] nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<nums.length; i++){
            s = s.replaceAll(nums[i],Integer.toString(i));
        }
        System.out.print(Integer.parseInt(s));
    }
}