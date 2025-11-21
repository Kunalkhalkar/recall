import java.util.*;
public class sum{
	public static void main(String x[]){
		int a[] = new int[8];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array");
		for(int i =0; i<a.length; i++){
			a[i] = sc.nextInt();
		}
		int count=0;
		for(int i=0,j=1,k=2; k<a.length; i++,j++,k++){
			if(a[i] + a[k] == a[j]){
				count++;
			}
		
		}
		System.out.println(count+"\t"+a.length);
	}
}