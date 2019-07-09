package com.cg.eis.service;

import com.cg.eis.bean.Order;
import com.cg.eis.dao.OrderDAO;
import com.cg.eis.dao.OrderDAOImpl;

public class OrderServiceImpl implements OrderService{

	OrderDAO dao=new OrderDAOImpl();
	@Override
	public int calculateOrder(Order o) {
		// TODO Auto-generated method stub
		double amount=0.0;
		amount=o.getQuantity()*o.getPrice();
		o.setAmount(amount);
		return (int)amount;
	}

	@Override
	public int saveOrder(Order o) {
		// TODO Auto-generated method stub
		dao.saveOrder(o);
		return 1;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		dao.display();
	}

	@Override
	public double calculateCharges(Order o) {
		// TODO Auto-generated method stub
		double amount=0.0;
		amount=o.getPrice()*0.0125;
		o.setCharges(amount);
		return amount;
	}

	@Override
	public Order findOrder(long oid) {
		// TODO Auto-generated method stub
		Order a=dao.findOrder(oid);
		return a;
	}
	

}