package Shooping;

public class cardItem {
	private Product product;
	private int quantity;
	
		
	
	public cardItem(Product product,int quantity) {
		this.product=product;
		this.quantity=quantity;	
	}
	public String toString() {
		return product.toString()+" Quantity : "+quantity;
	}
	public int getquantity() {
		// TODO Auto-generated method stub
		return quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setquantity(int quantity) {
		this.quantity=quantity;
		
	}
}
