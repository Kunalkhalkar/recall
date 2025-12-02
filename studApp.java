/*Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple computations.
*/
import java.util.*;
public class studApp{
	public static void main(String x[]){
		Student s[] = new Student[5];
		for(int i=0; i<s.length; i++){
			s[i] = new Student();
			s[i].setName("kunal");
			s[i].setRollNo(10);
			s[i].setMarks(new int[]{10,20,30});
			
		}
		System.out.println(s[2].getName());
	}
}

class Student{
	private int rollNo;
	private String name;
	private int []marks;
	
	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setMarks(int []marks){
		this.marks = marks;
	}
	
	public int getRollNo(){
		return rollNo;
	}
	public String getName(){
		return name;
	}
	public int[] getMarks(){
		return marks;
	}
	
	
}