//reversing the full string
import java.util.*;
import java.io.*;

public class RevString{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String to Reverse");
		
		String str = br.readLine();
		System.out.println(revString(str));
		
	}
	
	public static String revString(String str){
		if(str == null) return null;
		StringBuffer sb = new StringBuffer();
		
		for(int i = str.length()-1; i>= 0; i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}