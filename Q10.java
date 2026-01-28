/*
Q10. Write a Java program that reads a sentence from the user and counts the frequency of each 
word using a HashMap.  
The program should:  
• Accept a sentence as input.  
• Split the sentence into words.  
• Use a HashMap to count how many times each word appears.  
• Display each word and its frequency.  
Input : Java is easy and Java is powerful  
Output : Word Frequencies: Java: 2 is: 2 easy: 1 and: 1 powerful: 1
*/
import java.util.*;
public class Q10{
	public static void main(String ...x){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a line");
		String str = sc.nextLine();
		
		String strArr[] = str.split(" ");
		// System.out.println(Arrays.toString(strArr));
		HashMap<String, Integer> hm = new HashMap<>();
		for(String s : strArr){
			hm.put(s, hm.getOrDefault(s, 0)+1);
		}
		System.out.println(hm);
		
	}
	
}