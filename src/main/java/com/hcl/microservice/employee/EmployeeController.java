package com.hcl.microservice.employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	private EmployeeRepository repository;
	public EmployeeController() {
		repository = new EmployeeRepository();
		
	}
	
	@RequestMapping("/person")
	public Employee getPerson(@RequestParam(value="id",required=true) Long id)
	{
		return repository.getPerson(id);
	}

}
