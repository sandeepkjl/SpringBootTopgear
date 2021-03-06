package org.example.wipro.model;

public class EmployeeEntity {

    private String empId;
    private String empName;
    private String empMail;
    private String empLocation;


    public EmployeeEntity() {
        super();
    }


    public EmployeeEntity(String empId, String empName, String empMail, String empLocation) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empMail = empMail;
        this.empLocation = empLocation;
    }


    public String getEmpId() {
        return empId;
    }


    public void setEmpId(String empId) {
        this.empId = empId;
    }


    public String getEmpName() {
        return empName;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public String getEmpMail() {
        return empMail;
    }


    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }


    public String getEmpLocation() {
        return empLocation;
    }


    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }


    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empMail=" + empMail + ", empLocation="
                + empLocation + "]";
    }





}
