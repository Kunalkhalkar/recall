/*
Write a program to find the product of digits of a given number using recursion.
*/
import java.util.*;
public class Product{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a= sc.nextInt();
		
		System.out.println(showProduct(a, 1));
	}
	
	public static int showProduct(int num, int prod){
		if(num == 0){
			return prod;
		}
		prod *= num%10;
		return showProduct(num/10, prod);
	}
}