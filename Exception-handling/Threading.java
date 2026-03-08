/*
lets start with the threading 
*/
import java.util.*;
public class Threading{
	public static void main(String...x) throws Exception{
		Counter counter= new Counter();
		
		Thread1 t1 = new Thread1(counter);
		Thread1 t2 = new Thread1(counter);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());
	}
}

class Counter{
	static int count = 0;
	
	synchronized void counting(){
		count++;
	}
	
	public int getCount(){
		return count;
	}
}
class Thread1 extends Thread{
	
	Counter counter;
	
	Thread1(Counter counter){
		this.counter = counter;
	}
	
	public void run(){
		for(int i=0; i<1000; i++)
		{
			counter.counting();
		}
	}
}