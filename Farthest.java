/*
2078. Two Furthest Houses With Different Colors
There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
Return the maximum distance between two houses with different colors.
The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.

*/
import java.util.*;
public class Farthest{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array");
		int arr[] = new int[7];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findMaxDist(arr));
	}
	
	public static int findMaxDist(int ...arr){
		int i=0, j=1, maxDist =0;
		
		while(i < j){
			if(arr[i] != arr[j]){
				maxDist = Math.abs(i - j);
				j++;
			}
			i++;
		}
		return maxDist;
	}
}