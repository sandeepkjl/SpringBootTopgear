package org.example.wipro.controller;


import org.example.wipro.model.EmployeeEntity;
import org.example.wipro.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @RequestMapping(value = "/displayAll", method= RequestMethod.GET)
    public List<EmployeeEntity> getAllEmployees()
    {
        return empService.getAllEmployees();
    }

    @RequestMapping(value = "/display/{empId}", method= RequestMethod.GET)
    public EmployeeEntity getEmployeeById(@PathVariable("empId") String empId)
    {
        return empService.getEmployeeByEmpId(empId);
    }

    @RequestMapping(value = "/createEmployee", method= RequestMethod.POST, consumes = {"application/json"})
    public EmployeeEntity getEmployeeById(@RequestBody EmployeeEntity employeeEntity)
    {
        return empService.createNewEmployee(employeeEntity);
    }

    @RequestMapping(value = "/updateEmployee/{empId}", method= RequestMethod.PUT, consumes = {"application/json"})
    public EmployeeEntity updateEmployee(@PathVariable("empId") String empId,@RequestBody EmployeeEntity employeeEntity)
    {
        return empService.updateEmpById(empId, employeeEntity);
    }

    @RequestMapping(value = "/deleteById/{empId}", method= RequestMethod.DELETE)
    public EmployeeEntity deleteEmployeeById(@PathVariable("empId") String empId)
    {
        return empService.deleteEmpById(empId);
    }

}
