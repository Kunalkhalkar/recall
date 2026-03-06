/*
throw an Exception for wrong mobile number
*/
import java.util.*;
public class CheckMobile{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long number = sc.nextLong();
		try{
			checkMobNumber(number);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	public static void checkMobNumber(long num) throws Exception{
		int count =0;
		long temp = num;	
		while(num != 0){
			count++;
			num/=10;
		}
		if(count !=10){
			throw new Exception("Number is not correct");
		}
		System.out.println("number is correct");
	}	
}