package com.sts.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.rest.entity.Orders;
import com.sts.rest.repository.orderRepository;

@Service
public class OrderService {
	@Autowired
	private orderRepository serviceRepo;
	
	
	
	
	public List<Orders> getAllOrders() {
		List<Orders> list = new ArrayList<Orders>();
		this.serviceRepo.findAll().forEach(list::add);
		return list;
	}
	
	public void addOrders(Orders orders) {
		this.serviceRepo.save(orders);
	}
	public void updateOrders(Integer id, Orders orders) {
		this.serviceRepo.save(orders);
	}
	public void delOrders(Integer id) {
		this.serviceRepo.deleteById(id);
	}
	
	

}
