/*
Q15. Write a program to count digits in a string.
 Input : abc123
 Output : 3
*/
import java.util.*;
public class DigitCountString{
	public static void main(String ...x){
		System.out.println("Enter the string");
		
		String str = new Scanner(System.in).next();
		if(str.length() < 1){
			System.out.println("String size is zero");
			return;
		}
		int count =0;
		for(int i = 0; i < str.length(); i++){
			if((str.charAt(i)) >= 48 && (str.charAt(i)) <= 57){
				count++;
			}
			
		}
		System.out.println("digits is present in string is : "+ count );
	}
}