/*
Problem:
Create a Student class with:
int id
String name
double marks

1 ️⃣ Sort students by marks (highest first) using Comparable
2️ ⃣ Sort students by name (alphabetically) using Comparator
3️ ⃣ If marks are equal, sort by name
*/
import java.util.*;
public class College{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		
		int id;
		String name;
		float marks;
		
		ArrayList students = new ArrayList();
		
		for(int i= 0; i<5; i++){
		System.out.println("Enter id, name, marks of student");
			
		id = sc.nextInt();
		name = sc.next();
		marks = sc.nextFloat();
	
		students.add(new Student(id, name, marks));
		}
		Collections.sort(students);
		System.out.println(students);
	}
}

class Student implements Comparable<Student>{
	private int id; 
	private String name;
	private float marks;
	
	Student(int id, String name, float marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
		
	}
	
	public int compareTo(Student s){
		return Double.compare(s.marks, this.marks);
	}
	
	public String toString(){
		return (id + " "+ name +" "+ marks);
	}
}

class 