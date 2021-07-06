public class Test9 {
    public static void main(String[] args) {
        int n;
        n = recur(7);
        System.out.println();
        System.out.print(n);
    }
    public static int recur(int i){
        System.out.print(i);
        if(i < 1)
            return 2;
        else
            return 3 * recur(i - 1) + 1;

    }
}
