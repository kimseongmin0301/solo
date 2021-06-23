/**
 * Study0623
 * 프로그래머스
 * 로또의 최고 순위와 최저 순위
 */
public class Study0623 {

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] answer = new int[2];
        int o = 0;
        int a = 0;
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j])
                    o++;
            }  
            if(lottos[i] == 0)
                    a++;
        }
        switch(o+a){
            case 6 : answer[0] = 1; break;
            case 5 : answer[0] = 2; break;
            case 4 : answer[0] = 3; break;
            case 3 : answer[0] = 4; break;
            case 2 : answer[0] = 5; break;
            default : answer[0] = 6; break;
        }
        switch(o){
            case 6 : answer[1] = 1; break;
            case 5 : answer[1] = 2; break;
            case 4 : answer[1] = 3; break;
            case 3 : answer[1] = 4; break;
            case 2 : answer[1] = 5; break;
            default : answer[1] = 6; break;
        }

        //출력
        System.out.print("[");
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]);
            if(i < answer.length-1)
                System.out.print(",");
        }
        System.out.print("]");
    }
}