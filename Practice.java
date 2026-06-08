import java.util.*;
public class Practice{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data you want to store");
		String data = sc.nextLine();
		DataStore ds = new DataStore(data);
		System.out.println(ds.getData());
		
	}
}
public class DataStore{
	private String data;
	
	public DataStore(String data){
		this.data = data;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
	public String getData(){
		return data;
	}
}
