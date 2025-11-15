/*Q9.Implement a program to calculate product discounts based on price using POJO class and a 
separate service class for logic. 
 
Requirements: 
1. POJO Class – Product 
• Fields (private): 
o int productId 
o String productName 
o double price 
• Methods: 
o Public getter and setter methods for each field. 
• Note: Do not use a constructor; values must be set using setters. 

2. Logic Class – ProductService 
• Method 1: calculateDiscount(Product p) 
o Calculates discount based on the product price: 
▪ Price ≥ 1000 → Discount = 20% of price 
▪ 500 ≤ Price < 1000 → Discount = 10% of price 
▪ Price < 500 → Discount = 5% of price 
o Returns the discount amount. 
  
• Method 2: displayProductDetails(Product p) 
o Displays: 
▪ Product ID 
▪ Product Name 
▪ Price 
▪ Calculated Discount 
▪ Final Price after discount (Price − Discount) 
 
3. Main Method Instructions: 
1. Create a Product object. 
2. Assign values to the object using setter methods. 
3. Use ProductService to: 
o Calculate discount using calculateDiscount(). 
o Display product details using displayProductDetails(). 
*/
import java.util.*;
public class ProductManage{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product Id, product Name, price");
		int productId = sc.nextInt();
		String productName= sc.next(); 
		double price = sc.nextDouble(); 
		
		Product p = new Product();
		p.setProductId(productId);
		p.setProductName(productName);
		p.setPrice(price);
		
		ProductService ps = new ProductService();
		ps.calculateDiscount(p);
		ps.displayProductDetails(p);

	}
}

class Product{
	private int productId;
	private String productName; 
	private double price; 
	
	
	public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    // Getter and Setter for productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
	
}
/*Method 1: calculateDiscount(Product p) 
o Calculates discount based on the product price: 
▪ Price ≥ 1000 → Discount = 20% of price 
▪ 500 ≤ Price < 1000 → Discount = 10% of price 
▪ Price < 500 → Discount = 5% of price 
o Returns the discount amount. */
class ProductService{
	
		void calculateDiscount(Product p){
		double price = p.getPrice();
		double discount =0;
		if(price >= 1000){
			discount = price*0.20;
			p.setPrice(p.getPrice() + discount); 
			
		}
		else if(price >= 500){
			discount = price *0.10;
			p.setPrice(p.getPrice() + discount); 
			
		}
		else {
			discount = price *0.05;
			p.setPrice(p.getPrice() + discount); 
			
		}
	}
	
	/*Method 2: displayProductDetails(Product p) 
o Displays: 
▪ Product ID 
▪ Product Name 
▪ Price 
▪ Calculated Discount 
▪ Final Price after discount (Price − Discount)
*/

	void displayProductDetails(Product p){
		System.out.println(p.getProductId());
		System.out.println(p.getProductName());
		System.out.println(p.getPrice());
	
	}
	
}