/*
Q2. Write a program to reverse an array using recursion.
Input:
Array:
10 20 30 40 50
Output:
Reversed Array:
50 40 30 20 10
*/
import java.util.*;
public class Q2{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		
		int a[] = new int[5]; // array
		
		// taking array input
		for(int i = 0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		revArr(0, a.length-1, a); //initial calling point
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
		//return; // returnig the array
	}
}


