import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    // q 전역선언 - 이유 : 귀찮아서
    static Queue<Integer> q = new LinkedList<>();
    static int count = 0;
    public static void main(String[] args){
        // 13까지 가는 경우의 수
        // 뒤로 한칸 앞으로 2칸 가능
        // 15차례가 지나면 자동 종료
        // 풀 방식 BFS

        // 도착점
        int target = 2;

        // queue에 넣어준다 => offer은 넣은, poll은 뺌 
        // 0이 시작점
        q.offer(0);

        bfs(target);

        System.out.println(count);

    }
    static void bfs(int target){
        // 이제 간단하게 한개를 기준으로 갈 경우의 수 는 ??????? => +2, -1
        // Queue는 선입 선출 방식 (먼저 넣은게 먼저 나옴)


        // 처음에 해줘도 되는 이유 시작점을 Queue에 넣어 줬음
        // Queue 배열이 비었는가?라는 말 => Queue가 비었으면 컴파일 종료
        if(q.isEmpty()) return;

        // 이제 부터 중요함

        // Queue가 선입 선출 가장 앞에 있는 걸 뺌
        // 젤 첨음 0
        int next = q.poll();

        // 끝나는 조건의 줘야함
        // Queue에서 빠지는 조건이 target이랑 같으면 count 증가
        if(next == target){
            count = count + 1;
        }

        // 일정 이상 count일시 return
        if(count > 15) return;


        // 2칸 가는 경우의 수 , 뒤로 한칸 가는 경우의 수를 다시 Queue에 넣음
        q.add(next + 2);
        q.add(next - 1);

        // 무한 반복
        bfs(target);
    }
}