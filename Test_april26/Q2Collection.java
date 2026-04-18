/*
Q2. Write a Java program to store employee names with department and count
employees department wise.
Input:
Amit-IT
Ravi-HR
Neha-IT
Pooja-Sales
Raj-HR
 Output:
IT = 2
HR = 2
Sales = 1
*/
import java.util.*;
public class Q2Collection{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		for(int i =0; i<5; i++){
			System.out.println("Enter employee name and dept name");
			String emp= sc.next(); // employee
			String dept = sc.next(); // department
			map.put(emp, dept);
		}
		Set<String> set= new LinkedHashSet<>(); //set for unique element
		
		for(String str : map.keySet()){ // keySet of map
			set.add(map.get(str));
		}
		int count =0;
		for(String s : set){
			count = 0;
			for(String key : map.keySet()){
				if(map.get(key).equals(s)){ //checking if set value matches to map
					count++; // increase count
				}
			}
			System.out.println(s + " = "+ count);
		}
	}
}