/*242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

 */
 import java.util.*;
 import java.io.*;
 
 public class ValidAnagram{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str1 = br.readLine();
		
		System.out.println("Enter the String to check anagram of previous string");
		String str2 = br.readLine();
		
		System.out.println(isValidAnagram(str1, str2));
	}
	
	public static boolean isValidAnagram(String s, String t){
		if(s.length() != t.length()) return false;
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		int i=0;
		char cs, ct;
		while(i < s.length()){
			cs = s.charAt(i);
			ct = t.charAt(i);
			map.put(cs, map.getOrDefault(cs, 0)+1);
			map.put(ct, map.getOrDefault(ct, 0)-1);
			i++;
		}
		
		for(Character key : map.keySet()){
			if(map.get(key)!= 0) return false;
		}
		return true;
	}
	
 }