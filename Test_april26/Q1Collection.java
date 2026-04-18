/*
Q1.Write a Java program to store numbers in ArrayList and print duplicate elements.
Input:[10, 20, 30, 20, 40, 10]
Output: Duplicate Elements : 10 20
*/
import java.util.*;
public class Q1Collection{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element in Array list");
		ArrayList<Integer> al = new ArrayList<>(); //arraylist
		
		for(int i=0; i < 6; i++){
			al.add(sc.nextInt());
		}
		
		HashMap<Integer, Integer> map = new HashMap<>(); //hashMap initialisation
		for(Integer element : al){
			map.put(element, map.getOrDefault(element, 0)+1);
		}
		System.out.println("duplicate data");
		for(Integer key : map.keySet()){ //traverse map
			if(map.get(key) >1){
				System.out.print(key+ " ");
			}
		}
	}
}