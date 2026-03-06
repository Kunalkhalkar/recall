/*
using throw write your own exception for 
*/
import java.util.*;
public class AgeApp{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		
		try{
			int age = sc.nextInt();
			checkAge(age);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	public static void checkAge(int age) throws Exception{
		if(age < 1 || age > 120)
			throw new Exception("Invalid age");
		System.out.println("Age is correct");
	}
}
