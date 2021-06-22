/*
프로그래머스
[1차] 비밀지도
*/
public class Study0622 {
    public static void main(String[] args) {
        int n = 5;
        int [] arr1 = {9, 20, 28, 18, 11};
        int [] arr2 = {30, 1, 21, 17, 28};
        String[] answer= new String[n];
        for(int i = 0; i < n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        
        for(int i = 0; i < n; i++){
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }

        // 출력
        System.out.print("[");
        for(int i=0; i<n; i++){
            System.out.print('"' + answer[i] + '"');
            if(i < n-1)    
                System.out.print(",");
            else
                continue;
        }
        System.out.print("]");

}    
}
