/*
1855. Maximum Distance Between a Pair of Values
*/
import java.util.*;
public class MaxDist{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array one");
		int []arr1 =new int[5];
		for(int i=0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the array second");
		int []arr2 =new int[5];
		
		for(int i=0; i<arr2.length; i++){
			arr2[i] = sc.nextInt();
		}
		System.out.println("maximum distace is : "+ checkDist(arr1, arr2));
	}
	
	public static int checkDist(int[] arr1, int...arr2){
		int i= 0, j=0, maxDis =0;
		
		while(i<arr1.length && j <arr2.length){
			if(arr1[j] <= arr2[i]) 
			{
				maxDis = Math.max(maxDis, j - i);	
				j++;
			}
			else{
				i++;
			}
		}
		return maxDis;	
		
	}
}
