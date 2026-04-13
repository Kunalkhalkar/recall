/*
205. isomorphic String
*/
import java.util.*;
public class IsomorphicString{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String one");
		String str = sc.next();
		
		System.out.println("Enter the String two");
		String str1 = sc.next();
		
	}
	
	public static boolean checkIsomorphic(String s, String t){ // main and Target String
		if(s.length() != t.length()) return false;	
		
		HashMap<Character, character> map = new HashMap<>();
		HashMap<Character, Character> revmap = new HashMap<>();
		
		for(int i=0; i<s.length(); i++){
			Character cs = s.charAt(i);
			Character ct = t.charAt(i);
			
			if(map.containsKey(cs) || revmap.containsKey(ct)){
				if(map.get(cs) != ct || revmap.get(ct) != cs)return false;
				else{
					map.put(cs, ct);
					revmap.put(ct, cs);
				}
			}
		}
		return true;
	}
}