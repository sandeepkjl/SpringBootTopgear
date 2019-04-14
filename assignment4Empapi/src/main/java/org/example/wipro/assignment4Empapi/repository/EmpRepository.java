package org.example.wipro.assignment4Empapi.repository;

import org.example.wipro.assignment4Empapi.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Employee, String> {

	public void delete(String arg0);

	public Iterable<Employee> findAll();

	public Employee findOne(String empId);

	public Employee save(Employee emp);

	
}
