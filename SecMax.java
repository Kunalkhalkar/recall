import java.util.*;

public class SecMax{
	public static void main(String...x){
		System.out.println("Enter the value of array");
		int arr []= new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
		
		if(arr[i] > max ){
				secMax = max;
				max = arr[i];
			}
			
		}
		System.out.println("second max number is "+ secMax);
	}
	
}