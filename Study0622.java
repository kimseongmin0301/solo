/*
프로그래머스
[1차] 비밀지도
*/
public class Study0622 {
    public static void main(String[] args) {
        int n = 6;
        int [] arr1 = {46, 33, 33 ,22, 31, 50};
        int [] arr2 = {27 ,56, 19, 14, 14, 10};
        String[] answer= new String[n];
        for(int i = 0; i < n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }
        
        for(int i = 0; i < n; i++){
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
            System.out.println(answer[i]);
        }

        // 출력
        System.out.print("[");
        for(int i=0; i<n; i++){
            System.out.print('"' + answer[i] + '"');
            if(i < n-1)    
                System.out.print(",");
        }
        System.out.print("]");

}    
}
