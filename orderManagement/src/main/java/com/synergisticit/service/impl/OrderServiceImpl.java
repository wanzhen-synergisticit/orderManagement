package com.synergisticit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergisticit.factory.OrderFactory;
import com.synergisticit.factory.impl.OrderFactoryImpl;
import com.synergisticit.service.OrderService;

@Service

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderFactory orderFactory;

	@Override
	public void placeOrder() {
		orderFactory.getOrderService("shopify").placeOrder();
	}

	@Override
	public void getOrder() {
		orderFactory.getOrderService("shopify").getOrder();

	}

}
