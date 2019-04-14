package org.example.wipro.service;

import org.example.wipro.model.EmployeeEntity;
import org.example.wipro.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpService {

    @Autowired
    EmpRepository repository;

    public List<EmployeeEntity> getAllEmployees()
    {
        return repository.getAllEmployee();
    }

    public  EmployeeEntity getEmployeeByEmpId(String id)
    {
        return repository.getEmployeeById(id);
    }

    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity)
    {
        return repository.saveEmployee(employeeEntity);
    }


    public EmployeeEntity updateEmpById(String id, EmployeeEntity employeeEntity)
    {
        return repository.updateEmployee(id, employeeEntity);
    }


    public EmployeeEntity deleteEmpById(String id)
    {
        return repository.deleteEmployee(id);
    }


}
