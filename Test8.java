import java.util.LinkedList;
import java.util.Queue;

public class Test8 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.offer(0);
        q.add(2);
        q.poll();
        q.poll();

        System.out.print(q.peek());
        System.out.print(q);

    }
}
