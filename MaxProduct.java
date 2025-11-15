/*Q5. Write a java program to find the maximum product of two integers in a given array of 
integers.    
Example: 
Input :  
nums = { 2, 3, 5, 7, -7, 5, 8, -5 } 
Output:  
Pair is (7, 8), Maximum Product: 56 
*/
import java.util.*;
public class MaxProduct{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		int[] a = new int[5];
		
		for(int i= 0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		int product=0,p1=0, p2= 0;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] * a[j] > product){
					product = a[i] * a[j];
					p1 = a[i];
					p2 = a[j];
				}
			}
		}
		System.out.printf("%d,%d, and the max product is %d",p1,p2,product);
	}
}