package com.cg.eis.service;

import com.cg.eis.bean.Order;

public interface OrderService {
	public int calculateOrder(Order x); 
	public double calculateCharges(Order x);
	public int saveOrder(Order x);
	public void display();
	public Order findOrder(long xid);

}