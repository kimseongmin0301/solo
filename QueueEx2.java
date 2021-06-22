import java.util.LinkedList;
import java.util.Queue;

public class QueueEx2 {
    // 클래스를 만들어서 이렇게 Queue에 넣을수 있음
    static Queue<Location2> q = new LinkedList<>();

    static int[][] direction = {{0,1}, {0,-1}, {1,0}, {-1,0}};
    static int count = 0;
    public static void main(String[] args){
        int n = 2; 
        int[][] map = new int[n][n];

        // 젤 시작점, (0,0) (거리 1)
        q.offer(new Location2(0, 0, 1));

        bfs(map);

        System.out.println(count);
    }

    static void bfs(int[][] map){
        if(q.isEmpty()) return;

        Location2 location = q.poll();

        // 이제 끝나는 조건
        if(location.getX() == map.length-1 && location.getY() == map.length-1){
            count = location.getCount();
            return;
        }

        for(int i=0; i<direction.length; i++){
            int nextX = location.getX() + direction[i][1];
            int nextY = location.getY() + direction[i][0];

            // map의 범위 밖으로 나갔을 경우 그 nextX, nextY의 점은 패스 
            if(nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map.length) continue;

            // 카운터 다음 칸이니 +1
            q.offer(new Location2(nextX, nextY, location.getCount()+1));

        }
        bfs(map);

    }
}

class Location2{
    private int x;
    private int y;
    private int count;

    public Location2(int x, int y, int count){
        this.x = x;
        this.y = y;
        this.count = count;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "Location2 [count=" + count + ", x=" + x + ", y=" + y + "]";
    }
}