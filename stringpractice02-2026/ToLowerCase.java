/*
Q9. Write a program to convert a string into lowercase.
 Input : HELLO
 Output : hello
 ASCII VALUES
 
 A= 65;
 a= 97;
 
 reverse the string not full, word by word
*/
import java.util.*;
public class ToLowerCase{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		StringBuilder sb = new StringBuilder("");
		String s = sc.nextLine();
		
		String a [] = s.split(" ");
		System.out.println(Arrays.toString(a));
	}
	
	public static String[] split(String str, String ss ){
		if(str.length < 1){
			return new String[]{""};
		}
		
	}
}