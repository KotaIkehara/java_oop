package exercise;

import java.time.LocalDate;

public class Order {
	public String code;
	public LocalDate date;
	public int price;
	public int quantity;
	public boolean delivery;
	public Order(String code, LocalDate date, int price, int quantity, boolean delivery) {
		super();
		this.code = code;
		this.date = date;
		this.price = price;
		this.quantity = quantity;
		this.delivery = delivery;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isDelivery() {
		return delivery;
	}
	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}
	
	
}
