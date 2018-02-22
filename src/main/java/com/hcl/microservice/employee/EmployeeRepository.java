package com.hcl.microservice.employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
	
	private Map<Long,Employee> personMap;
	
	public EmployeeRepository() {
		personMap = new HashMap<Long,Employee>();
		
		Employee p1 = new Employee(1L,"Ram","sodhi");
		Employee p2 = new Employee(1L,"Monoj","srivastava");
		Employee p3 = new Employee(1L,"Mukul","Kumar");
		personMap.put(1L, p1);personMap.put(2L, p2);personMap.put(3L, p3);
			
	}

	public Employee getPerson(Long id)
	{
		return personMap.get(id);
	}
}
