/*
Exception handling in Array i.e. ArrayIndexOutOfBounds
*/
import java.util.*;
public class Exception2{
	public static void main(String... x){
		Scanner sc = new Scanner(System.in);
		int a[];
		System.out.println("Enter the size of array");
		while(true){
			try{
				int n = sc.nextInt();
				a = new int[n]; // it can throw NegativeArraySizeException
				break;
			}
			catch(NegativeArraySizeException e){
				System.out.println("Enter the positive size of array");
				//sc.next(); // does not required beacuase exception not thrown by input 
			}
			catch(InputMismatchException ex){
				System.out.println("Enter the Integer value");
				sc.next(); // required here beacause it thrown by input scanner buffer value is cleared 
			}
		}
		while(true){
			System.out.println("Enter the element in array");
			try{
				for(int i=0; i< a.length; i++){
					a[i] =sc.nextInt();
				}
				break;
			}
			catch(InputMismatchException ex){
				System.out.println("Enter correct Integer value");
				sc.next();
			}
		}
		try{
			for(int i=0; i<10; i++){
				System.out.println(a[i]);
			}
		System.out.println(Arrays.toString(a));
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Your code goes out  of bounds");
		}
		System.out.println("Now I can Exit Successfully");
			
	}
	
}