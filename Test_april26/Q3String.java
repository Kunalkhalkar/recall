/*
Q3. Write a Java program to find all anagram pairs.
Description: Find anagram pairs from list.
Input: Enter words: cat tac act dog god
Output:
cat tac
cat act
tac act
dog god
*/
import java.util.*;
public class Q3String{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array of anagram String");
		String []strs = new String[8];
		for(int i=0; i<strs.length; i++){
			strs[i] = sc.next();
		}
		
		for(int i=0; i<strs.length; i++){
		HashMap<Character, Integer> map = new HashMap<>(); //hashMap initialisation
			for(int j= i +1; j< strs.length; j++){
				String one = strs[i];
				String two = strs[j]; 
				if(one.length() != two.length()) break;
				else{
					
					
					for(Character ch : one.toCharArray()){ // converting to char Array
						map.put(ch, map.getOrDefault(ch, 0)+1);
					}
					for(Character ch : two.toCharArray()){
						map.put(ch, map.getOrDefault(ch, 0)-1);
					}
					boolean flag = true;
					for(Character key : map.keySet()){
						if(map.get(key) < 0) { // checking condition
							flag = false;
							break;
						}
					}
					if(flag){
						System.out.println(one + " "+ two); // if anagram print
					}
				}
			}
		}
	}
	
}