package com.synergisticit.factory.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.synergisticit.factory.OrderFactory;
import com.synergisticit.service.OrderService;

@Service
public class OrderFactoryImpl implements OrderFactory {

	@Autowired
	@Qualifier(value = "shopifyOrderServiceImpl")
	private OrderService shopifyOrderServiceImpl;

	@Autowired
	@Qualifier(value = "magentoOrderServiceImpl")
	private OrderService magentoOrderServiceImpl;

	@Autowired
	@Qualifier(value = "customOrderServiceImpl")
	private OrderService customOrderServiceImpl;
	
	@Autowired
	@Qualifier(value = "demandWareOrderServiceImpl")
	private OrderService demandWareOrderServiceImpl;

	@Override
	public OrderService getOrderService(String type) {

		switch (type) {

		case "shopify":
			return shopifyOrderServiceImpl;

		case "magento":
			return magentoOrderServiceImpl;

		case "custom":
			return customOrderServiceImpl;
	
		case "demandWare":
			return demandWareOrderServiceImpl;
		default:
			return customOrderServiceImpl;
		}

	}

}
