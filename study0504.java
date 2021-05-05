//번호 가리기
class Solution {
    public String solution(String phone_number) {
        String answer = "";
      for(int i = 0; i < phone_number.length();i++){
        if(i<phone_number.length()-4){
            answer += "*";
        } else {
            answer += phone_number.charAt(i);
        }   
         }
        return answer;
    }
}
// phone_number	return
// "01033334444"	"*******4444"
// "027778888"	"*****8888"