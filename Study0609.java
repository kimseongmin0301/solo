public class Study0609 {
    public static void main(String[] args) {
        long n = 12345;
        String num = Long.toString(n); 
        int[] answer = new int[num.length()]; 
        int index = 0; 
        for (int i = num.length()-1; i >= 0; i--) { 
            answer[index++] += Integer.parseInt(num.charAt(i)+""); 
        } 

        // 출력물입니다.
        // System.out.print("[");
        // for(int i=0; i<answer.length; i++){
        //     if(i == answer.length-1)
        //         System.out.print(answer[i]);
        //     else
        //         System.out.print(answer[i] + ",");
        // }
        // System.out.print("]");
        
    }
}
