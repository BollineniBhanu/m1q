package com.cg.eis.exception;

public class OrderLessThanOne extends Exception{
	private int quantity;
	public OrderLessThanOne() {
		// TODO Auto-generated constructor stub
	}
	public OrderLessThanOne(String msg,int quantity) {
		// TODO Auto-generated constructor stub
		super(msg);
		this.quantity=quantity;
		
	}
	@Override
	public String toString() {
		return "OrderLessThanOne:[quantity=" + quantity+ "]"+super.getMessage();
	}
	


}