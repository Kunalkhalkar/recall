/*
Q5. Write a java program to implement binary search from array.
Input:
Array: 10 20 30 40 50 60
Search: 40
Output: Element found at index 3
*/
import java.util.*;
public class Q5{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of array");
		
		int a[] = new int[7]; // array declaration
		
		for(int i =0; i< a.length; i++){
			a[i] = sc.nextInt(); // taking input
		}
	
		System.out.println("Enter element to find");
		int ele = sc.nextInt();
		
		int index = searchElement(ele, a); // calling function
		if(index != -1)
		System.out.println("element found : "+index);
		else
		System.out.println("Element not found"); //if element found
		
	}
	
	static int searchElement(int element, int []a){
		int i = 0, j= a.length-1, mid = (j + i)/2; 
		
		while(i < j && j < a.length){
			if(a[mid] == element){
				return mid;
			}
			else if (element > a[mid]){
				i = mid;
				mid = (j + i)/2; //calculating mid
			}
			else if(element < a[mid]){
				j = mid;
				mid = (j + i)/2; //calculating mid
			}
		}
		return -1;
	}
}