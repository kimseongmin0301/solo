import java.util.ArrayList;

/**
 * Study0721
 * 프로그래머스
 * 기능개발
 */
public class Study0721 {

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1,30,5};
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<progresses.length; i++){
            int ma = (100 - progresses[i]) % speeds[i];
            int day = (100 - progresses[i]) / speeds[i];
            if(ma != 0)
                day += 1;
            arr.add(day);
        }
        
        int count = 1;
        int j = 0;
        while(true){
            if(arr.get(j) >= arr.get(j+1)){
                arr.remove(j+1);
                count++;
            }
            else{
                j++; 
                arr2.add(count);
                count = 1;
            }
            if(arr.size() -1 == j){
                arr2.add(count);
                break;
            }
        }
        int[] answer = new int[arr2.size()];
		for (int i = 0; i < arr2.size(); i++) {
			answer[i] = arr2.get(i);
		}


        //출력
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}