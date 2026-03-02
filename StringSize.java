/*
String count size 
*/
import java.util.*;
public class StringSize{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to konow the size");
		String str = sc.nextLine();
		
		int count = 0;
		for(int i=0; i<str.length(); i++){
			count++;
		}
		System.out.println("Size of String is : "+count);
	}
	
}