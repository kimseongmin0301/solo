/**
 * Study0505
 *  phone_number	    return
    "01033334444"	    "*******4444"
    "027778888"     	"*****8888"
 * 
 */
public class Study0505 {
        public String solution(String phone_number) {
            String answer = "";
             answer = phone_number.replaceAll("[0-9]","*").substring(0,phone_number.length()-4)+phone_number.substring(phone_number.length()-4,phone_number.length());
            return answer;
        
    }
}