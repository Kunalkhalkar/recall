/*Q9. Write a program using ArrayList to store exam marks of students. Take a number from the user 
and count how many times it appears in the list. 
Explanation: 
• Store marks in an ArrayList. 
• Traverse the list using a loop. 
• Compare each element with the user input and maintain a count. 
• Demonstrates searching and frequency counting using ArrayList. 
*/
import java.util.*;
public class Q9{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student marks");
		ArrayList<Integer> marks = new ArrayList<>();
		
		int count =0, i, n=10;
		for(i=0; i<n; i++){
			marks.add(sc.nextInt());
		}
		
		System.out.println("Marks added successfully");
		System.out.println("Enter the marks you want to find");
		int target = sc.nextInt();
		
		for(i=0; i<n; i++){
			if(marks.get(i) == target)
				count++;
			
		}
		System.out.println("the marks you have tageted have the frequency of : "+ count);
	}
}