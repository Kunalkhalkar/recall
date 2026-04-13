/*
443. String compression
chars = ['a','a', 'b', 'b', 'c', 'c', 'c'];
ans: chars['a', '2', 'b', '2', 'c', '3'];

*/
import java.util.*;
import java.io.*;

public class StringCompress443{
	public static void main(String...x) throws Exception{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array of characters");
		char arr[] = new char[7];
		
		String str = sc.nextLine();
		arr = str.toCharArray();
		//System.out.println(Arrays.toString(arr));
		System.out.println(compress(arr));
	}
	
	public static int compress(char[] arr){
		int idx = 0;
		int i=0, count = 0;
		while(i < arr.length){
			char ch = arr[i];
			count = 0;
			
			while(i < arr.length && ch == arr[i]){
				count++;
				i++;
			}
			if(count == 1) {arr[idx++] = ch;}
			else{
				arr[idx++] = ch;			
				String c = Integer.toString(count);
				for(char digit : c.toCharArray()){
					arr[idx++] = digit;
				}
			}
		}
		return idx;
	}
}