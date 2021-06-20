/**
 * Study0620
 * 프로그래머스
 * 스킬트리
 */
public class Study0620 {

    public static void main(String[] args) {
        int answer = 0;
        String s = "CBD";
        String[] k = {"BACDE", "CBADF", "AECB", "BDA"};
        for(int i=0; i<k.length; i++){
            String a = k[i];
            int size = k[i].length();
            for(int j=0; j<size; j++){
                String o = String.valueOf(a.charAt(j));
                if(!s.contains(o))
                    k[i] = k[i].replace(o,"");
            }
            if(s.indexOf(k[i]) == 0)
                answer++;
            
        }
        System.out.print(answer);
    }
}