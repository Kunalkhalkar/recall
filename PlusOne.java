/*66. Plus One
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/
import java.util.*;
public class PlusOne{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int []arr = new int[5];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	}
	
	public static int[] plusOne(inr[] arr){
	
		int i = arr.length -1, k= arr.length;
		
		while(i >= 0){
			if(arr[i] < 9){ 
				arr[i]++;
				return arr;
			}
			arr[i]=0;
			i--;
		}
		
		int result[] = new int[k+1];
		result[0] = 1;
		return result;
	}
}