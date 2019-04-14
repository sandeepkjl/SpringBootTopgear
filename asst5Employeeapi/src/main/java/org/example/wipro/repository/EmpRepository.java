package org.example.wipro.repository;

import org.example.wipro.model.EmployeeEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmpRepository {

    private static HashMap<String, EmployeeEntity> employeeMap;

    static {

        employeeMap = new HashMap<String, EmployeeEntity>();

        employeeMap.put("EM1001", new EmployeeEntity("EM1001","Rohan","roahn@mail.com","pune"));
        employeeMap.put("EM1002", new EmployeeEntity("EM1002","Karan","karan@mail.com","Hyderabad"));
        employeeMap.put("EM1003", new EmployeeEntity("EM1003","Ayush","ayush@mail.com","banglore"));
        employeeMap.put("EM1004", new EmployeeEntity("EM1004","Rahul","rahul@mail.com","noida"));
        employeeMap.put("EM1005", new EmployeeEntity("EM1005","Kaushal","kaus@mail.com","pune"));
    }


    public List<EmployeeEntity> getAllEmployee()
    {
        List<EmployeeEntity> employees = new ArrayList<EmployeeEntity>();

        employees.addAll(employeeMap.values());

        return employees;

    }

    public EmployeeEntity getEmployeeById(String empId)
    {
        return employeeMap.get(empId);
    }

    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity)
    {
        employeeMap.put(employeeEntity.getEmpId(),employeeEntity);

        return employeeEntity;
    }

    public EmployeeEntity updateEmployee(String empId, EmployeeEntity entity)
    {
        EmployeeEntity employeeEntity=employeeMap.remove(empId);
        employeeMap.put(entity.getEmpId(),entity);

        return employeeEntity;
    }

    public EmployeeEntity deleteEmployee(String empId)
    {

        return employeeMap.remove(empId);
    }



}
