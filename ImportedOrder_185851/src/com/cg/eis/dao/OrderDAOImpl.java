package com.cg.eis.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cg.eis.bean.Order;

public class OrderDAOImpl implements OrderDAO{

	Map<Long,Order> acc=new TreeMap<Long,Order>();
	@Override
	public int saveOrder(Order o) {
		// TODO Auto-generated method stub
		System.out.println(o);
		acc.put(o.getId(), o);
		return 1;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Collection<Order> val=acc.values();
		ArrayList<Order> vallist=new ArrayList<>(val);
		for(Order a:vallist)
		{
			System.out.println(a);
		}
		
	}

	@Override
	public Order findOrder(long oid) {
		// TODO Auto-generated method stub
		Order ob=acc.get(oid);
		return ob;
	}
}