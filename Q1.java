/*
Q1. Write a java program to print 1 to nth Strong number.
*/
//all digit factorial sum = number is Strong
import java.util.*;
public class Q1{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int temp = num;
		int sum =0;
		while(num !=0){
			int digit = num%10;
			int fact = findFact(digit);
			sum += fact;
			num/=10;
		}
		if(sum == temp){
			System.out.println("Number is Strong");
		}
		else{
			System.out.println("Number is not Strong");
			
		}
	}
	public static int findFact(int digit){
		if(digit !=0){
			int fact=1;
			for(int i=1; i<=digit; i++){
				fact *= i;
			}
			return fact;
		}
		return 0;
	}
}