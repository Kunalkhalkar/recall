/*Q3. Write a Java program to count all triplets (i, j, k) such that:
• i < j < k
• arr[i] + arr[j] + arr[k] < target
Description :-
You need to count total valid combinations of three different indexes.
Input
• First line contains integer n
• Second line contains n integers
• Third line contains integer target
Output :-
Print total count of triplets.
Input - 5 1 3 4 7
 12
Output - 4
Explanation
Valid triplets:
• (1,3,4) = 8
• (1,3,5) = 9
• (1,4,5) = 10
• (1,3,7) = 11
Total = 4*/
import java.util.*;
public class Q3{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		int arr[] = new int[5];// array initilisation
		
		for(int i= 0; i< arr.length; i++){
			arr[i] = sc.nextInt(); //taking input
		}
		
		System.out.println("Enter the target"); 
		int target = sc.nextInt(); // taking input
		int i =0, sum =0, count =0;
		for(; i < arr.length; i++){
			sum =0; // sum reset
			for(int j=0; j < arr.length; j++){
				
				for(int k=0; k<arr.length; k++){
					sum = arr[i] + arr[j]+ arr[k];
					if((i < j && j< k) && sum < target) { //condition check 
						count++;
					}
					
				}
			}
		}
		System.out.println(count); //printing count
	}

}