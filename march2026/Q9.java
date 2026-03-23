/*
Q9. Write a Java program to find all anagram pairs.
Description: Find anagram pairs from list.
Input: Enter words: cat tac act dog god
Output:
cat tac
cat act
tac act
dog god
*/
import java.util.*;
public class Q9{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words");
		String str = sc.nextLine();
	
		String []strs = str.split(" ");
		System.out.println(Arrays.toString(strs));
	}
	
	boolean isAnagram(String []s){
		for(int i =0; i<s.length; i++){
			String temp = s[i];
			for(int j = 0; j<s.length; j++){
				String temp2 = s[j];
				if(String.sort(temp).equals(String.sort(temp2))){
					System.out.println(temp+" "+temp2);
				}
			}
		}
	}
}