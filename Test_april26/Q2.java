/*Q2. Write a Java program to find the smallest positive integer missing from an unsorted
array.
 Description :-
The array may contain:
• Negative numbers
• Zero
• Duplicate numbers
• Large values
You must return the first missing positive integer.
Input :-
• First line contains integer n
• Second line contains n space-separated integers
Output :-
Print the smallest missing positive integer.
 Input :- 3 4 -1 1 2
 Output :- 5
*/
import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array element"); 
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt(); //array input
		}
		
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i]  > max) {
				max = arr[i];
			}
		}
		int min = arr[0];
		int i =0, j=0;
		do{
			i++;
		}
		while(arr[i] <=0 && i< arr.length);
		
		boolean flag = true; // setting flag
		if(max > 0) {
			for(j=0; i<max; i++, j++) {
				if(i != arr[j]) {
			System.out.println("missing number is :: "+ i);
					flag = false;
					break; // loop break
				}
			}
			if(flag)
			System.out.println("missing number is : "+ ++i);
			
			
		}
		else {
			System.out.println("All number are negative so missing number is : 1");
		}
		
	}

}
