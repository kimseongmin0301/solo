/**
 * Study0630
 */
public class Study0630 {

    public static void main(String[] args) {
        String s = "())(()";
        boolean answer = true;
        char[] data = s.toCharArray();
        int num = 0;
        for(int i=0; i < data.length; i++){
            if(data[i] == '(')
                num++;  
            else
                num--;

            if(num < 0){
                answer = false;
                break;
            }
        }

        //출력
        if(answer&&num == 0) 
            System.out.print(true);
        else
            System.out.print(false);
    }
}