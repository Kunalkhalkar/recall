/*
Q8. Check whether expression has balanced parentheses.
Input:
{[()]}
Output:
Balanced
*/

import java.util.*;
public class Q8{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the paranthsis"); // accept paranthesis
		String str = sc.nextLine();
		
		char []ch = str.toCharArray(); // converting to array
		
		Stack<Character> st = new Stack<>();
		boolean flag = false;
		for(int i=0; i<ch.length; i++){ //loop
			if(ch[i] == '{' || ch[i] == '(' || ch[i] == '['){
				st.push(ch[i]); //pushing to stack
			}
			else if((ch[i] == '}' || ch[i] == ')' || ch[i] == ']')){
				if(!st.isEmpty()){
				flag = true;
					break;
				}
				Character s = st.pop(); // perform pop() operation
				if(s == '{' || s == '[' || s == '('){
					continue;
				}
			
			}
		}
		if(flag){ //condition check
			System.out.println("not balanced"); 
		}
		else{
			System.out.println("balanced");
		}
	}
}