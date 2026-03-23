/*
functional interfaces in java (interface has only one abstract method)
*/
// @functinalInterface
public class A{
	public static void main(String...x){
		ABC abc = (int y) -> System.out.println("HELLO "+y); // lamda function of the ABC interface
		abc.a(10);
	}
	
}

interface ABC{
	void a(int y); //method of functional interface
}
