/*
1. Longest Subarray With Sum ≤ K
Description:
Given an integer list nums and integer k, return the maximum length of a contiguous subarray whose sum is ≤ k.
Example:
Input: nums=[2,3,1,2,4], k=7
Output: 3
Explanation: [3,1,2] has sum 6 ≤ 7.
*/
import java.util.*;
public class LongestSubArraySizeSum{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Element");
		int a[] = new Int[5];
		System.out.println("Enter the value of k");
		for(int i =0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int i= 0, j=0 maxJ=0;
		while(j<= a.length){
			int sum = 0;
			if(sum <= k){
				sum+=a[j];
				j++;
				if(maxJ < (j - i)){
					maxJ= (j - i);
				}
			}
			else if(sum > k){
				sum-=a[i];
				i++;
			}
			
		}
	}
	
}
