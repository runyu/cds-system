package com.food.ordering.system.cdssystem.service;

import com.food.ordering.system.cdssystem.model.Employee;
import com.food.ordering.system.cdssystem.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> listAllEmployees() {
        return employeeRepo.findAll();
    }
}
