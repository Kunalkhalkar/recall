import java.util.*;
import java.io.*;

public class Capatilize{
	public static void main(String ...x)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String to capatilize Each Letter");
		
		String str = br.readLine();
		System.out.println(capitalize(str));
	}
	
	//another method for perform capitalize operation
	public static String capitalize(String str){
		if(str == null) return null;
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i =0; i< str.length(); i++){
			char a = str.charAt(i)
			if(a >= 'a' && a <= 'z'){
				sb.append((char)(a -32
				));
			}
			else{
				sb.append(a);
			}
		}
		return sb.toString();
	}
}