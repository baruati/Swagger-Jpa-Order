package com.sts.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.rest.entity.Orders;
import com.sts.rest.services.OrderService;

@RestController

public class OrderController {
	@Autowired
	private OrderService service;

	@GetMapping("/orders")
	public List<Orders> getAllOrders() {
		return service.getAllOrders();

	}

	@PostMapping("/addorder")
	public void addOrders(@RequestBody Orders orders) {
		this.service.addOrders(orders);
	}

	@PutMapping("/orders/{orderId}")
	public void updateOrders(@PathVariable String orderId, @RequestBody Orders orders) {
		this.service.updateOrders(Integer.parseInt(orderId), orders);
	}

	@DeleteMapping("/orders/{orderId}")
	public void delOrders(@PathVariable String orderId) {
		this.service.delOrders(Integer.parseInt(orderId));
	}

}
