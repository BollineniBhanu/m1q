package com.cg.eis.bean;
public class Order {
	private long Orderid;
	private double Orderprice;
	private int Orderquantity;
	private double Orderamount;
	private double Ordercharges;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	// constructor using field from source
	public Order(long id, double price, int quantity) {      
		super();
		this.Orderid = id;
		this.Orderprice = price;
		this.Orderquantity = quantity;
	}
	//getter setter methods
	public long getId() {
		return Orderid;
	}
	public void setId(long id) {
		this.Orderid = id;
	}
	public double getPrice() {
		return Orderprice;
	}
	public void setPrice(double price) {
		this.Orderprice = price;
	}
	public int getQuantity() {
		return Orderquantity;
	}
	public void setQuantity(int quantity) {
		this.Orderquantity = quantity;
	}
	public double getAmount() {
		return Orderamount;
	}
	public void setAmount(double amount) {
		this.Orderamount = amount;
	}
	public double getCharges() {
		return Ordercharges;
	}
	public void setCharges(double charges) {
		this.Ordercharges = charges;
	}
	@Override
	public String toString() {
		return "Order [id=" + Orderid + ", price=" + Orderprice + ", quantity=" + Orderquantity + ", amount=" + Orderamount + ", charges="
				+ Ordercharges + "]";
	}
	
	

}