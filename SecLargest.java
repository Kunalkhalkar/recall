/*
find the second largest number from array
*/
import java.util.*;
public class SecLargest{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the array elements");
			int a[] = new int[5];
			
			for(int i=0; i<a.length; i++){
				a[i] = sc.nextInt();
			}
			int  max = Integer.MIN_VALUE, secmax = Integer.MIN_VALUE;
			for(int i=0; i<a.length; i++){
				if(a[i] > max){
					secmax = max;
					max = a[i];
				}	
			}
			System.out.println(secmax);
		}
}