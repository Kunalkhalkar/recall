/*
remove duplicates from the array
*/
import java.util.*;
import java.io.*;
public class RemoveDuplicate{
	public static void main(String ...x) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the array elements");

		int arr[] = new int[5];		
		for(int i = 0; i< arr.length; i++){
			arr[i] = sc.nextInt();
		}
			
		//if(arr.length < 2) return;
		for(int i = 0, j = arr.length - 1, k = 1; i < arr.length; ){
			if(arr[i] == arr[k]){
				i++;
				k++;
				
			} 
		}
		for(int i=0; i<arr.length; i++){	
		}
		
	}
}