/*
Q7.Write a java program to store N integers in a HashMap. Find all Armstrong numbers. 
Input: 
6 
153 10 370 89 407 25 
Output: 
Armstrong Numbers: 153 370 407
*/
import java.util.*;
public class Q7{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of hash map");
		int a = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a; i++){
			map.put(i, sc.nextInt());
		}
		
		System.out.println("Arm Strong number are");
		for(int i=0; i<a; i++){
			if(isArmStrong(map.get(i)))
			{
				System.out.println(map.get(i));
			}
		}
	}
	
	
	public static boolean isArmStrong(int num){
		int temp = num;
		int count = 0;
		while(temp!=0){
			count++;
			temp/=10;
		}
		temp = num; // temparory store sum
		int sum=0;
		while(temp !=0){
			int digit = temp%10;
				int tsum=1;
			for(int i = 0; i<count; i++){
				tsum *= digit; // calculate sum
			}
			sum+=tsum;
			//System.out.println(sum);
			temp/=10;
		}
		if(sum == num){
			return true;
		}
		return false;
	}
}