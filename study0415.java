// UP&DOWN GAME
import java.util.Random;
import java.util.Scanner;

public class study0415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("UP&DOWN GAME \n범위 : 0-99");
		int k = r.nextInt(100);
		int count=1;

		while(true) {

			System.out.print(count++ + ">>");
			int n=sc.nextInt();
			if (k > n) {
				System.out.println("UP");
			}
			else if(n > k) {
				System.out.println("DOWN");
			}
			else if(n == k) {
				System.out.println("끝.. 다시하려면 y");
				System.out.println("y/n");
				String z = sc.next();
				if(z.equals("n"))
					break;
				else if(z.equals("y"))
					count = 1;
					continue;
			}

		}
		
			
			
	}	
		
		
}


