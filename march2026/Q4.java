/*
Q4. Write a program in java to rotate an array by N positions without using other array.
Input:
The given array is: 0 3 6 9 12 14 18 20 22 25 27
From 4th position the values of the array are: 12 14 18 20 22 25 27
Before 4th position the values of the array are: 0 3 6 9
After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3 6 9
*/
import java.util.*;
public class Q4{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		int []a = new int[11]; //avoid input
		
		 for(int i = 0; i<a.length; i++){
			 a[i] = sc.nextInt();
		 }
		
		System.out.println("Enter value from where you want to rotate the array");
		int target = sc.nextInt();
	
		revArr(0, a.length-1, a);
		revArr(0, (a.length-1-target), a);
		revArr(a.length-target, a.length-1, a);
		
		for(int rev : a){
			System.out.print(rev + " "); //printing reversed array
		}
	}
	 
	static void revArr(int i, int j, int[]arr){
		if(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			revArr(++i, --j, arr); // recursive call
		}
		return; // returning 
	}
}