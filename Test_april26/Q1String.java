/*
Q1. Write a Java program to remove duplicate characters.
Description:Keep only the first occurrence.
Input:Enter string: programming
Output:progamin
String
*/
import java.util.*;

public class Q1String{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		Set<Character> set = new LinkedHashSet<>();// linked hashset keeps order
		
		for(char ch : str.toCharArray()){
			set.add(ch);
		}
		StringBuilder sb = new StringBuilder(); //String builder for fast performance 
		for(Character ch : set){
			sb.append(ch);
		}
		System.out.println(sb.toString());// converting to string
	}
}
