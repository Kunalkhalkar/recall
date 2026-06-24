/*
	reverse the array using the two pointer approch
*/

import java.io.*;
import java.util.*;

public class ReverseArray{
	public static void main(String...x) throws Exception{
		System.out.println("Enter the array elements");
		int arr [] = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i < arr.length; i++){
			arr[i]  = Integer.parseInt(br.readLine());
		}
		System.out.println(Arrays.toString(arr));
		System.out
	}
	
}