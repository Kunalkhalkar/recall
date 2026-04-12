/*

leetcode 28. Find the Index of the First Occurrence in a String
	Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 
*/
import java.util.*;
import java.io.*;
public class needleCheck{
	public static void main(String ...x) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// it improves performance
		System.out.println("Enter the String for the hayStack");
		String haystack = br.readLine();
		
		System.out.println("Enter the String for the needle");
		String needle = br.readLine();
		
		System.out.println(checkString(haystack, needle));
	}
	
	public static int checkString(String haystack, String needle){
		
		int hlength = haystack.length();
		int nlength = needle.length();
		
		if(hlength < nlength) return -1;
		if(nlength < 1) return 0;
		
		int i=0;
		char start = needle.charAt(0);
		while(i <= hlength - nlength){
			if(haystack.charAt(i) == start){
				int j = 0, k = i;
				boolean flag = true;
				
				while(j < nlength){
					if(haystack.charAt(k) != needle.charAt(j)){
						flag = false;
						break;
					}
					k++;
					j++;
				}
				if(flag) return i;
			}
			i++;
		}
		return -1;
	}
}