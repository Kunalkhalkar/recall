/*Q2. Write a program in java to find a subarray with given sum from the given array?
		Expected Output :
		The given array is : 3 4 -7 1 3 3 1 -4
		[0..1] -- { 3 4 }
		[0..5] -- { 3 4 -7 1 3 3 }
		[3..5] -- { 1 3 3 }
		[4..6] -- { 3 3 1 }
*/
import java.util.*;
public class SubArray{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array");
		int a[] = new int[7];
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		int sum =a[0];
		System.out.println("Enter the target");
		int target = sc.nextInt();
		int i=0,j =0;
		while(j<a.length)
		{
			if(sum < target){
					sum+=a[j];
					j++;
				}
				while(i<j){
					if(sum == target){
					System.out.printf("(%d...%d) -- a[%d]..a[%d]",a[i],a[j],i,j);
					j++;
					sum+=a[j];	
				}
				else if(sum > target){
					sum-=a[i];
					i++;
				}
			}
		}
		
	}
}