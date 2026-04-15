/*
383. Ransom Note
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.
Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true 
*/
import java.util.*;
public class RansomNote{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the magazine");
		String magazine = sc.next();
		
		System.out.println("Enter the ransomeNote");
		String ransomeNote = sc.next();
		
		System.out.println(cheackRansom(ransomeNote, magazine));
		
	}
	public static boolean cheackRansom(String ransomeNote, String magazine){
		int rl = ransomeNote.length();
		int ml = magazine.length();
		
		if(rl > ml) return false;
		
		HashMap<Character, Integer> map = new HashMap<>();
		char ch;
		
		for(int i=0; i< ml; i++){
			ch = magazine.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(int i=0; i< rl; i++){
			ch = ransomeNote.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)-1);
		}
		for(Character key:map.keySet()){
			if(map.get(key) < 0) return false;
		}
		
		return true;
	}
	
}
