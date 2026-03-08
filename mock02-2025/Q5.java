/*
Q5. Write a java program to store words in an ArrayList. Print words that start and end with the 
same character. 
Input: [level, cat, radar, java, madam] 
Output : level , radar , madam 
Description: 
Traverse each word and compare first and last character manually using charAt().
*/
import java.util.*;
public class Q5{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		System.out.println("Enter the data in array list");
		for(int i=0; i<6; i++){
			al.add(sc.next()); //taking input 
		}
		
		for(int i=0; i < 6; i++){
			String str = al.get(i);
			int j=0, k=str.length()-1;
				if(str.charAt(i) == str.charAt(k)){
					System.out.println(str); //printing string
				}
		}
	}
}
