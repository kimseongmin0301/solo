import java.util.Arrays;

/**
 * Study0728
 */
public class Study0728 {
    static int n = 5;
    static int[] lost = {2,4};
    static int[] reserve = {1,3,5};
    public static void main(String[] args) {
        int answer = 0;
        int[] student = new int[n];
        Arrays.fill(student,1);
        
        for (int i = 0; i < lost.length; i++) {
        	student[lost[i]-1]--;
		}
        for (int i = 0; i < reserve.length; i++) {
        	student[reserve[i]-1]++;
		}
        
        for (int i = 0; i < student.length; i++) {
        	if (student[i] > 1) {
        		if (i > 0) {
        			if (student[i-1] == 0) {
        				student[i]--;
        				student[i-1]++;
        			} else if (i < student.length-1 && student[i+1] == 0) {
        				student[i]--;
        				student[i+1]++;
        			}
        		}
        	}
		}
        
        for (int i : student) {
			if (i > 0)
				answer++;
		}
        
        System.out.print(answer);
    }
}