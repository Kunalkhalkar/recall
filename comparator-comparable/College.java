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
		Student students[] = new Student[5];
		
		int id;
		String name;
		float marks;
		
		for(int i= 0; i<students.length; i++){
		System.out.println("Enter id, name, marks of student");
		id = sc.nextInt();
		name = sc.nextLine();
		marks = sc.nextFloat();
	
		students[i] = new Student(id, name, marks);
		}
		
	}
}

class Student{
	private int id; 
	private String name;
	private float marks;
	
	Student(int id, String name, float marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}