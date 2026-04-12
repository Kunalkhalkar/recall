/*
valid Anagram approch 2
*/
import java.util.*;
import java.io.*;

public class ValidAnagram2{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String 1");
		String str1 = br.readLine();
		
		System.out.println("Enter the second anagram String");
		String str2 = br.readLine();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		System.out.println(isAnagram(str1, str2));
	}
	
	public static boolean isAnagram(String s, String t){
		if(s.length() != t.length()) return false;
		
		int []freq = new int[26];
		int i =0;
		char c;
		while(i < s.length()){
			c = s.charAt(i);
			freq[c - 'a']++;
			i++;
		}
		i=0;
		while(i < t.length()){
			c = t.charAt(i);
			freq[c - 'a']--;
			i++;
		}
		
		for(int k : freq){
			if(k != 0){
				return false;
			}
		}
		return true;
	}
}