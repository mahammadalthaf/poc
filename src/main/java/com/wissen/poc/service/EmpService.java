package com.wissen.poc.service;

import com.wissen.poc.model.Employee;

import java.util.List;

public interface EmpService {
    Employee saveEmp(Employee e);
    Employee getEmp(int empId);

    List<Employee> getAllEmps();

    Employee updateEmp(Employee e);

}
