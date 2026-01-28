/*Q8. Write a program that maintains a Vector of city names. Perform the following: 
1. Insert 5 cities. 
2. Remove the city at index 3. 
3. Insert a new city at index 1. 
4. Display final list. 
*/
import java.util.*;
public class Q8{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city name in vector");
		Vector<String> cities = new Vector<>();
		
		for(int i=0; i<5; i++){
			cities.add(sc.next());
		}
		System.out.println();
		for(String v : cities){
			System.out.print(v + "\t");
		}
		
		System.out.println("\nremoved city name is : "+cities.get(3));
		cities.remove(3);
		System.out.println("Enter a new city to add");
		String c = sc.next();
		cities.add(1, c);
		
		System.out.println();
		for(String v : cities){
			System.out.print(v + "\t");
		}
	}
}