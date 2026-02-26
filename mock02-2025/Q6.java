/*
Q6. Write a java program to store N integers in a Vector. Replace all even numbers with 0. 
Input: 
6 
2 5 8 7 10 3 
 
Output: 
Modified Vector: 0 5 0 7 0 3
*/
import java.util.*;
public class Q6{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Enter the number Integer to store");
		int n = sc.nextInt();
		
		System.out.println("Enter the integers");
		for(int i = 0; i<n; i++){
			v.add(sc.nextInt());
		}
		
		for(int i =0; i<v.size(); i++){
			if(v.get(i)%2 == 0){
				v.set(i, 0);
			}
		}
		System.out.println(v);
	}
}