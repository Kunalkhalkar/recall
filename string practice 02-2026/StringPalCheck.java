/*
Q7. Write a program to check whether a string is palindrome or not.
 Input : madam
 Output : Palindrome
*/
import java.util.*;
public class StringPalCheck{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		
		boolean flag = true;
		for(int i=0, j=str.length()-1; i<j; i++, j--){
			if(str.charAt(i) != str.charAt(j)){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("String is palindrome");
			return;
		}
		System.out.println("String is not a palindrome");
		
	}

}