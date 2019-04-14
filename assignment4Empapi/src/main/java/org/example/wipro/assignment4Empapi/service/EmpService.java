package org.example.wipro.assignment4Empapi.service;

import java.util.ArrayList;
import java.util.List;

import org.example.wipro.assignment4Empapi.entity.Employee;
import org.example.wipro.assignment4Empapi.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpService {
	
	@Autowired
	private EmpRepository repository;
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> emps = new ArrayList<Employee>();
		Iterable<Employee> employees = repository.findAll();
		for(Employee e: employees)
		{
			emps.add(e);
			
		}
		
		return emps;
	}

	public Employee saveEmp(Employee emp)
	{
		return repository.save(emp);
	}
	
	public Employee getEmpById(String empId)
	{
		return repository.findOne(empId);
	}
}
