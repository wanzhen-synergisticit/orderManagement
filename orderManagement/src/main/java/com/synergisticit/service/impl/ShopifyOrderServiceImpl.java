package com.synergisticit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.synergisticit.service.OrderService;

@Service
public class ShopifyOrderServiceImpl implements OrderService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void placeOrder() {
		restTemplate.postForObject(null, null, String.class);
		
	}

	@Override
	public void getOrder() {
		// TODO Auto-generated method stub
		
	}

	
}
