/*
Q1. Write a program to find the third largest element in a given integer array. If the array contains duplicate
values, consider only distinct elements.
Input: n = 7 Array = 12 35 1 10 34 35 12
Output: Third Largest Element = 12
*/
import java.util.*;
public class Q1{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for(int i=0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int first =a[0], second = Integer.MIN_VALUE, third=Integer.MIN_VALUE;
		
		for(int i= 0; i<a.length; i++){
			if(a[i] > first){
				third= second;
				second = first;
				first = a[i];
			}
		}
		System.out.println(third);
	}
}