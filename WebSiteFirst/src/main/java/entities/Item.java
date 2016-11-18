package entities;

public class Item {
	private product product;
	private int quantity;
	
	public Item() {
		super();
	}
	
	public Item(entities.product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public product getProduct() {
		return product;
	}
	public void setProduct(product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
