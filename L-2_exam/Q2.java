/*Q2.Write a program in java to find a subarray with given sum from the given array?
Output :
The given array is : 3 4 -7 1 3 3 1 -4
[0..1] -- { 3 4 }
[0..5] -- { 3 4 -7 1 3 3 }
[3..5] -- { 1 3 3 }
[4..6] -- { 3 3 1 }

*/
import java.util.*;
public class Q2{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in array");
		int a[] = new int[]{3, 4, -7, 1, 3, 3, 1, -4};
		System.out.println("Enter the target sum");
		int target = sc.nextInt();
		
		int i =0, j=0;
		int sum =0;
		
		while(j < a.length){
			if(sum == target){
				System.out.printf("["+i+"..."+j+"]"+"--"+ "{");
				for(int k=i; k<j; k++){
					System.out.print(a[k]+", ");
				}
				System.out.printf("}");
				System.out.println();
				sum+=a[j];
				j++;
			}
			else if(sum < target){
				sum += a[j];
				j++;
			}
			else{
				sum -= a[i];
				i++;
			}
		}
	}
}