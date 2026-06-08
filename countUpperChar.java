/*
Q14. Write a Java program to count uppercase letters.
Description:Count how many uppercase letters exist in string.
Input:Enter string: JaVaPro
Output:Uppercase letters: 3
*/
import java.io.*;
public class counntUpperChar{
	public static void main(String...x)throws Exception{
		BufferedReader br = new BufferedReader(InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();

		int count =0;
		for(int i=0; i<str.lenght(); i++){
			char ch = str.charAt(i);
			if(ch >='A' && ch <= 'Z'){
				count++;
			}
		}
		System.out.println(count);
	}
}