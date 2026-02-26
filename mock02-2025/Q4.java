/*
Q4. Store N strings in an ArrayList. Reverse each string manually and store in another Arraylist. 
Input: 3 
java 
code 
list 
Output : Reversed List: avaj edoc tsil 
Description: 
Traverse each string character by character in reverse order. Do not use StringBuilder reverse() 
or inbuilt reverse methods.
*/
import java.util.*;
public class Q4{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);  
		
		ArrayList<String> al = new ArrayList<>();
		System.out.println("Enter how many string you want to store");
		int n = sc.nextInt();// input
		
		for(int i=0; i<n; i++){
			al.add(sc.next()); // input for list
		}
		System.out.println(revEachWord(al));
	}
	
	public static ArrayList<String> revEachWord(ArrayList<String> al){
		
		ArrayList<String> ral = new ArrayList<>();
		for(int i = 0; i<al.size(); i++){
			String b = revString(al.get(i));
			ral.add(b);
		}
		return ral;//return list
	}
	
	public static String revString(String str){
		StringBuilder sb= new StringBuilder("");
		
		for(int i=str.length()-1; i>=0 ; i--){
			sb.append(str.charAt(i));
		}
		
		return sb.toString(); // return string
	}
	
}