/**
Q3. Write a java program to Check If a Number Is a Neon Number or Not Neon number using 
function recursion.
*/

import java.util.*;
public class Q3{
	public static void main(String x[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to check neon");
		int num = sc.nextInt();
		int square =1, sum=0;		
		boolean b= isNeon(num, num*num , sum);
		if(b){
			System.out.println("Number is neon");
		}
		else{
			System.out.println("Number is not neon");
		}
	}
	public static boolean isNeon(int n, int square, int sum){
		if(square == 0 ){
			if(sum == n){
				return true;
			}
			return false;
		}
		sum += square%10;
		return isNeon(n, square/10, sum);
		
		
	}
}