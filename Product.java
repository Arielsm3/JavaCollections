package project1;

public class Product extends Item {

	private int productId;
	private String productName;
	private double sellingPrice;
	private int availableQuantity;
	
	public Product() {
		
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	public void calculateSellingPrice() {
		double buyingPrice = super.getBuyingPrice();
		double sellingPrice = ((buyingPrice * 0.5) + buyingPrice);
		
		System.out.println("Selling price of this item is" + sellingPrice);
	}
	
}
