/*
Sorting Employees by salary

Sorting Map by value

Sorting custom objects with 3 conditions
*/
import java.util.*;
public class Company{
	public static void main(String ...x){
		
		ArrayList<Employee> emps = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < 5; i++){
			
			System.out.println("Enter the id, name, salary");
			int id = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();
			emps.add(new Employee(id, name, salary));
			
		}
		Collections.sort(emps);
		System.out.println(emps);
	}
}

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	
	Employee(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int compareTo(Employee e){
		return Double.compare(e.salary, this.salary);
	}
	
	 public String toString(){
		 return (id + " "+ name +" "+ salary);
		}
}
