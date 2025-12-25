/*Write a program to find the sum of even numbers up to n using recursion.*/
import java.util.*;
public class AdditionEven{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto find addition");
		int n= sc.nextInt();
		
		System.out.println(findAddition(n, 1, 0));
	}
	public static int findAddition(int n, int i, int add){
		if(i > n){
			return add;
		}
		if(i %2 == 0){
			add += i;
		}
		return findAddition(n, i+1, add);
	} 
}