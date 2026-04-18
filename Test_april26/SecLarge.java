/*
Q1. Write a Java program to find the second largest distinct element in an integer array.
 If the second largest distinct element does not exist, print -1.
Description :-The array may contain duplicate values. You must consider only distinct
numbers.
 Input :-
• First line contains integer n
• Second line contains n space-separated integers
 Output :- Print the second largest distinct element.
 Input - 7 3 9 9 5 7
 Output - 7
 Explanation :-
Distinct elements = {3,5,7,9}
Second largest = 7
*/

import java.util.*;
public class SecLarge{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Element");
		int arr[]= new int[6];
		
		for(int i=0; i< arr.length; i++){
			arr[i]= sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){
			if(arr[i]> max){
				secMax = max;
				max = arr[i];
			}
		}
		if(secMax == Integer.MIN_VALUE){
			System.out.println(-1);
		}
		else{
			System.out.println(secMax);
		}
	}
}