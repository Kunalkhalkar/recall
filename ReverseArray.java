/*
	reverse the array using the two pointer approch
*/

import java.io.*;
import java.util.*;

public class ReverseArray{
	public static void main(String...x) throws Exception{
		System.out.println("Enter the array elements");
		int arr [] = new int[6];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i < arr.length; i++){
			arr[i]  = Integer.parseInt(br.readLine());
		}
		System.out.println("Array without reverse");	
		System.out.println(Arrays.toString(arr));
		System.out.println("reversed Array using two pointer approch");
		System.out.println(Arrays.toString(reverseArray(arr)));
	}
	
	public static int[] reverseArray(int ...arr){
		int i=0, j=arr.length-1, temp;
		while(i < j){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}
	
	
}