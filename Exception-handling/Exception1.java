/*
write a program for the exception
*/
import java.util.*;
public class Exception1{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer");
		while(true){
			try{
				int i = sc.nextInt();
				System.out.println(i);
				break;
			}
			catch(InputMismatchException ex){
				System.out.println("you have entered wrong data try again");
				sc.next(); // we used sc.next() to reset the previous input from scanner buffer
			}
		}
	}
}