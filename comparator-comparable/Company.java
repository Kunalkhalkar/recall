/*
Sorting Employees by salary

Sorting Map by value

Sorting custom objects with 3 conditions
*/
class Employee implements Comparable<Emplpoyee>{
	int id;
	String name;
	int salary;
	
	Employee(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int compareTo(Employee e){
		return Double.compare(s.salary, this.salary);
	}
	
	public String toString(){
		return (id + " "+ name +" "+ salary);
	}
}
public class Company{
	public static void main(String ...x){
		System.out.println("Enter the id, name, salary");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc.next();
		int salary = sc.nextInt();
		
	}
}
