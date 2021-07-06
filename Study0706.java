import java.util.LinkedList;
import java.util.Queue;

/**
 * Study0706
 * 프로그래머스
 * 다리를 지나는 트럭
 */
public class Study0706 {
    static int bridge_length = 2;
    static int weight = 10;
    static int[] truck_weights = {7,4,5,6};
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        int answer = 0, sum = 0;
        for(int i=0; i<truck_weights.length; i++){
            while(true){
                if(queue.isEmpty()){ //비었을때
                    sum+=truck_weights[i];
                    queue.offer(truck_weights[i]);
                    answer++;
                    break;
                }else if(queue.size()==bridge_length) //다리에 트럭이 가득 찼을때
                    sum-=queue.poll();
                else{
                    if(sum+truck_weights[i]<=weight){ //다리 무게 이하일때
                        queue.offer(truck_weights[i]);
                        sum+=truck_weights[i];
                        answer++;
                        break;
                    }else{
                        answer++;
                        queue.add(0);
                    }
                }
            }
        }
        System.out.print(answer+bridge_length);
    }
}