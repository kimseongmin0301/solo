import java.util.Scanner;

//equals example



public class s0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		System.out.println("강낭콩을 쳐봐 >>");
		
		String t = sc.nextLine();
		
		if(t.equals("강낭콩"))  // ㅁ.equals("")
			System.out.println("제대로 입력하였음");
			else
				System.out.println("틀렸음");
		
		
	}

}
