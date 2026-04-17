/*
58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.*/
import java.util.*;
public class LengthOfLastWord{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
		System.out.println(lengthCount(str));
	}
	public static int lengthCount(String str){
		// this approch is not very suitable as it can create empty String in String array
		// String []strs = str.split(" ");
		// String s = strs[strs.length -1];
		// return s.length();
		
		//this is another approch
		String n = str.trim();
		int i = n.length()-1, count =0;
		
		while(i >= 0 && n.charAt(i) != ' '){
			count++;
			i--;
		}
		
		return count;
		
	}
}