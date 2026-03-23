/*

Q10.Write program to group words by their length using HashMap.
Input:
cat dog elephant tiger lion
Output:
3 → cat dog
4 → lion
5 → tiger
8 → elephant
*/

import java.util.*;
public class Q10{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words");
		String str = sc.nextLine();
	
		String []strs = str.split(" ");
		System.out.println(Arrays.toString(strs));
		
		HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
		
	}
}