/*
throw the user defined exception
*/
import java.util.*;
public class Throw{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		int a;
		while(true){
			System.out.println("Enter the age");
			try {
				a = sc.nextInt();
				break;
			}
			catch(InputMismatchException ex){
				System.out.println("input mismatched");
				sc.next();
			}
		}
		if(a < 18){
			throw new ArithmeticException("you are Not Eligible for vote");
		}
		System.out.println("You are eligible for vote");
	}
}