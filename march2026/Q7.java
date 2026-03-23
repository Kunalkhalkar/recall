/*
Q7. Write a program to enter the String and sum of the all Digits in a given String
 input : abcd123pqe12mn12abc
 output is Sum is 147
 (note sum of number is 123+12+12 =147)
 */
 
 import java.util.*;
 public class Q7{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");// input String
		String str = sc.next();
		
		StringBuffer sb = new StringBuffer("");
		int sum = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
				sb.append(str.charAt(i));
				if(i != str.length()-1){
					continue;
				}
			}
			else {				
				if(!sb.isEmpty()) {
				sum += Integer.parseInt(sb.toString());
				}
				sb = new StringBuffer("");	
			}
			if(!sb.isEmpty()){
				sum += Integer.parseInt(sb.toString());
			}
		}
		System.out.println("Sum is : "+sum);
	}
 }