/*
dynamic sliding window
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
import java.util.*;
public class ArrayWindow{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[9];
		System.out.println("Enter the element in array");
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();	
			
		}
		
		int i=0, j=1;
		
		if(a.length < 1){
			System.out.println("array length is zero");
			System.exit();
		}
		while(j < a.length){
			
		}
		
	}
}