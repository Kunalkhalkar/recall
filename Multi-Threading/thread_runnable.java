/*
threading using runneble interface
*/
import java.util.*;
public class thread_runnable{
	public static void main(String ...x) throws Exception{
		Counter c = new Counter();
		
		Thread1 t1 = new Thread1(c);
		Thread1 t2 = new Thread1(c);
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println(c.getCount());
	}
}

class Thread1 implements Runnable{
	Counter counter;
	
	Thread1(Counter counter){
		this.counter = counter;
	}
	
	public void run(){
		for(int i = 0; i<1000; i++){
			counter.counting();
		}
	}
}

class Counter{
	public static int count=0;
	
	public synchronized void counting(){
		count++;
	}
	
	public int getCount(){
		return count;
	}
}