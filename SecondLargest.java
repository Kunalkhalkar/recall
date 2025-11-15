/*
Q6. Write a java program to give an array, find the second largest element.
*/
import java.util.*;
public class SecondLargest{
	public static void main(String x[]){
		System.out.println("Enter array elements");
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		for(int i = 0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i<a.length; i++){
			int temp;
			for(int j = i; j < a.length; j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int max = a[0], secMax = 0;
		for(int i =0; i<a.length; i++){
			if(a[i] > max){
				secMax = max;
				max = a[i];
			}
		}
		for(int val: a){
			System.out.println(val);
		}
		if(secMax ==0){
			System.out.println("there is no second MAX");
		}
		else
		System.out.println(secMax);
	}
}