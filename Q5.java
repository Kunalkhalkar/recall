/*
Q5. Write a java program to find the “ Leaders ” in an array. - A leader in an array is an element which is larger than all the elements to its right side, 
which is what you can see in the above output. 
Input :- arr – { 15 , 18 , 5 , 7 , 9 , 2 } 
Output :- 2 , 9 , 18
*/

import java.util.*;
public class Q5{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		int a[] = new int[6];
		
		for(int i =0; i< a.length; i++){
			a[i] = sc.nextInt();
		}
		
		int arr[] = new int[a.length];
		int count= 0;
		for(int i=a.length-1; i>=0; i--){
			boolean flag = isGreater(a[i], arr);
			arr[i] = a[i];
			if(flag){
				System.out.print(a[i]+" ");
				count++;
			}
		}
		System.out.println("\nElements found " + count);
	}
	
	public static boolean isGreater(int g, int ...arr){
		if(g == 0)
			return false;
		for(int i = arr.length-1; i>=0; i--){
			if(g < arr[i]){
				return false;
			}
		}
		return true;
	}
	
}