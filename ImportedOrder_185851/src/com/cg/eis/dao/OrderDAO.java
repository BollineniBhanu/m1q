package com.cg.eis.dao;
import com.cg.eis.bean.Order;
public interface OrderDAO {
public int saveOrder(Order o);
public void display();
public Order findOrder(long oid);

	}
