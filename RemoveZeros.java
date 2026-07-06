/*
remove zeros from array
*/
import java.util.*;

public class RemoveZeros{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in array");
		int a[] = new int[5];
		
		for(int i =0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		// System.out.println(Arrays.toString(a));
		removeZeros(a);
	}
	public static void removeZeros(int[] a){
		if(a.length ==0) System.out.println("Array is empty");
		int i= 0, j=0;
		//this loop checks the zeros and send it to the end
		while(j < a.length){
			if(a[i] == 0){
				if(a[j] != 0){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
				}
				j++;
			}
			else{
				i++;
				j++;
			}
		}
		//printing the result
		for(int k =0; k< i; k++){
			System.out.print(a[k]+ " ");
		}
	}
}