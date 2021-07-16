/**
 * Study0716
 * 프로그래머스
 * 신규 아이디 추천
 */
public class Study0716 {

        public static void main(String[] args) {

        String new_id = "...!@BaT#*..y.abcdefghijklm";

        new_id = new_id.toLowerCase();
        
        String pattern = "[^-_.0-9a-z]";
        new_id = new_id.replaceAll(pattern,"");
        
        pattern = "\\.{2,}";
        new_id = new_id.replaceAll(pattern,".");
        
        if (new_id.charAt(0) == '.') 
			new_id = new_id.substring(1);
        
        if (!"".equals(new_id) && new_id.charAt(new_id.length() - 1) == '.')
			new_id = new_id.substring(0, new_id.length() - 1);
        
        if(new_id.equals(""))
            new_id = "a";
        
        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15);
            if(new_id.charAt(new_id.length()-1) == '.')
                new_id = new_id.substring(0,new_id.length()-1);
        }
        
        if (new_id.length() <= 2) {
			while (new_id.length() < 3) {
				new_id += new_id.substring(new_id.length() - 1);
			}
		}
        
        System.out.print(new_id);
    }
}
