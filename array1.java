/*
Revising old programs
reverse the array
*/
import java.util.*;
public class array1{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of array");
		int a[] = new int[6];
		
		for(int i= 0; i<a.length; i++){
			a[i]= sc.nextInt();
		}
		
		int i=0, j=a.length-1;
		while(i<j){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;	
		}
		System.out.println(Arrays.toString(a));
	}
}