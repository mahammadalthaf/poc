package com.wissen.poc.service;

import com.wissen.poc.model.Employee;
import com.wissen.poc.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class EmpServiceImpl implements EmpService{

    @Autowired
    private EmpRepository empRepo;

    @Override
    public Employee saveEmp(Employee e) {
        return empRepo.save(e);
    }

    @Override
    public Employee getEmp(int empId) {
        return empRepo.findById(empId).get();
    }

    @Override
    public List<Employee> getAllEmps() {
        return empRepo.findAll();
    }

    @Override
    public Employee updateEmp( Employee e) {
        return  empRepo.save(e);
    }
}
