package bean;

public class ShoppingCart {
    private int item_id;
    private String item_name;
    private int unit_price;
    private int amount;
    private int total_price;
	public ShoppingCart() {
		
	}
	public ShoppingCart(int item_id, String item_name, int unit_price, int amount, int total_price) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.unit_price = unit_price;
		this.amount = amount;
		this.total_price = total_price;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
    
}
