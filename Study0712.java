/**
 * Study0712
 * 프로그래머스
 * 땅따먹기
 */
public class Study0712 {
    static int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
    public static void main(String[] args) {
        int answer = 0;
        int max = 0;
        for(int i=1; i<land.length; i++){
            for(int j=0; j<land[0].length; j++){
                max = 0;
                for(int k =0; k<land[0].length; k++){
                    if(k == j)
                        continue;
                    else
                        max = Math.max(max,land[i-1][k]);
                }
                land[i][j] += max;
            }
            
        }
        for(int i=0; i<land[0].length; i++){
            if(answer < land[land.length-1][i])
                answer = land[land.length-1][i];
        }

        System.out.print(answer);
    }
}