/*
remove zeros from array
*/
import java.util.*;

public class RemoveZerosFromArray{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in array");
		int a[] = new int[5];
		
		for(int i =0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		//printing the original array
		System.out.println(Arrays.toString(a));
		removeZeros(a); //function calling 
	}