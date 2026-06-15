import java.util.*;
public class Practice{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		int i=3;
		while(i >= 0){
			System.out.println("Enter the data you want to store");
			String data = sc.nextLine();
			DataStore ds = new DataStore(data);
			System.out.println(ds.getData()+" "+ i);
			i--;
		}
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
