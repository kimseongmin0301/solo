/**
 * Study0723
 * leetcode
 * Palindrome Number
 */
public class Study0723 {

    public static void main(String[] args) {
        int x = 121;
        int a = 0, b = 0, c;
        c = x;
        if(x<0)
            System.out.print(x + "는 Palindrome Number이 아니다");
        else{
            while( c != 0 ){
                a = c % 10;
                b = b * 10 + a;
                c  /= 10;
            }
            if(x == b)
               System.out.print(x + "는 Palindrome Number이다");
            else
                System.out.print(x + "는 Palindrome Number이 아니다");
        } 
    }
}