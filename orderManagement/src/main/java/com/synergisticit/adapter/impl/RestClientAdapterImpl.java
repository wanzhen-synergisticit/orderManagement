package com.synergisticit.adapter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.synergisticit.adapter.RestClientAdaptor;

@Service
public class RestClientAdapterImpl implements RestClientAdaptor {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void callApi() {
		restTemplate.postForObject(null, null, String.class);

	}

}
