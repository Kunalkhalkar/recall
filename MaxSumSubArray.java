/*
find maximum sum sub array
*/
import java.util.*;
public class MaxSumSubArray{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		int a[] = new int[5];
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		int i=0, j=0, temp1, temp2, maxSum = -1;
		while(j < a.length){
			temp1 = a[i];
			temp2 = a[j];
			if(temp1 + temp2 == maxSum){
				j++;
				
			}
		}
	}
}