/*
Q1. Write a Java program that accepts a string from the user. Create two threads:
• Thread 1 prints characters at even index positions.
• Thread 2 prints characters at odd index positions.
Threads should print characters alternately in correct sequence.
Description
If input string is MULTI, then:
• Thread 1 prints M, L, I
• Thread 2 prints U, T
Final output should follow original sequence using thread coordination.
*/
import java.util.*;
public class Q1Thread{
	public static void main(String ...x) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String"); // taking input
		String str = sc.next();
		thread t1 = new thread(str);
		thread1 t2 = new thread1(str);
		t1.start();
		t2.start();
		
	}
}

class thread extends Thread{ // thread1
	String str;
	
	thread(String str){
		this.str = str;
	}
	
	public synchronized void run(){
		try{
		for(int i = 0; i < str.length(); i++){
			if(i %2 == 0){
				System.out.print(str.charAt(i));
			}
			//Thread.sleep(100); // sleep for 100ms
		}
		}
		catch(Exception ex){ //exception handling
			System.out.println("Error is "+ex);
		}
	}
}

class thread1 extends Thread{ //thread 2
	String str;
	
	thread1(String str){
		this.str = str;
	}
	
	public synchronized void run(){
		try{
		for(int i = 0; i < str.length(); i++){
			if(i %2 != 0){
				System.out.print(str.charAt(i));
			}
			//Thread.sleep(100);//sleep for 100ms
		}
		}
		catch(Exception ex){//exception handling
			System.out.println("Error is "+ex);
		}
		
	}
}
