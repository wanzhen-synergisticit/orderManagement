package com.synergisticit.factory;

import com.synergisticit.service.OrderService;

public interface OrderFactory {
	
	public OrderService getOrderService(String type);
	
	

}
