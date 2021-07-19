/**
 * Study0719
 * leetcode
 * Reverse Integer
 */
public class Study0719 {

    public static void main(String[] args) {
        int x = -123;
        String strX = String.valueOf(x);
        int reverse= 0;
        if(x <0){
            for(int i=1; i < strX.length(); i++ ){
                int temp = x % 10;
                reverse += Math.pow(10, strX.length()-i-1) * temp;
                x = x / 10;
            }
        } else{
            for(int i=1; i <= strX.length(); i++ ){
                int temp = x % 10;
                reverse += Math.pow(10, strX.length()-i) * temp;
                x = x / 10;
            }
        }
     
        if(reverse >= Math.pow(2, 31) -1  || reverse <= Math.pow(-2, 31) )
            System.out.print("0");
        else
            System.out.print(reverse);
    }
}