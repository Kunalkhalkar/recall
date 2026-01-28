/*Q4. Problem: 
Given an array of positive integers and a target sum S, find the length of the smallest contiguous 
subarray whose sum is greater than or equal to S. If no such subarray exists, return 0. 
Example: 
Input: arr = [2,3,1,2,4,3], S = 7 
Output: 2 (subarray [4,3]). 
Explanation: 
Expand window until the sum ≥ S. Then shrink from the left while maintaining the condition to 
minimize length. 
*/
import java.util.*;
public class Q4{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array");
		
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int i=0, j=1, count =0;
		System.out.println("Enter the target");
		int target = sc.nextInt();
		int sum =0;
		while(i <= j && j<arr.length){
			if(sum < target)
			{
				sum += arr[j];
				j++;
			
			}
			if(sum >= target){
				sum-=arr[i];
				i++;
			
			}
		}
		System.out.println("smallest window size is : "+ (j-i-1));
	}
}