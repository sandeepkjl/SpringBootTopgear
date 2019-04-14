package org.example.wipro.assignment4Empapi.controller;

import java.util.List;

import org.example.wipro.assignment4Empapi.entity.Employee;
import org.example.wipro.assignment4Empapi.repository.EmpRepository;
import org.example.wipro.assignment4Empapi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmpService service;
	
	
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
	
	@RequestMapping("/employeeForm")
	public String empFormPage()
	{
		return "employeeForm";
	}
	
	@RequestMapping(value="/createEmployee",method=RequestMethod.POST)
	@ResponseBody
	public Employee createEmployee(@ModelAttribute("emp") Employee emp)
	{
		Employee employee = service.saveEmp(emp);
		return employee;
	}
	
	@RequestMapping(value="/diaplayAll", method=RequestMethod.GET)
	@ResponseBody
	public List<Employee> displayAllEmployee()
	{
		return service.getAllEmployee();
	}
	
	@RequestMapping(value="/displayEmployeeById/{empId}", method=RequestMethod.GET)
	@ResponseBody
	public Employee displayEmployeeById(@PathVariable("empId") String empId)
	{
		return service.getEmpById(empId);
	}
	

}
