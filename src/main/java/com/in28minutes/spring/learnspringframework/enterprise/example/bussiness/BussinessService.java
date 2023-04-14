package com.in28minutes.spring.learnspringframework.enterprise.example.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.learnspringframework.enterprise.example.data.DataService;

@Component
public class BussinessService {

	// @Autowired
	private DataService dataService;

	@Autowired
	public BussinessService(DataService dataService) {
		super();
		System.out.println("Constructor Injection");
		this.dataService = dataService;
	}

	// @Autowired
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}

	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();

	}
}
