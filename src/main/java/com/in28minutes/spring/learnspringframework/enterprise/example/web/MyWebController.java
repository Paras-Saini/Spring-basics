package com.in28minutes.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.learnspringframework.enterprise.example.bussiness.BussinessService;

@Component
public class MyWebController {
	@Autowired
	private BussinessService bussinessService;

	public long returnValueFromBussinessService() {
		return bussinessService.calculateSum();
	}
}
