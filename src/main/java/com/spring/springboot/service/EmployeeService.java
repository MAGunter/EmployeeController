package com.spring.springboot.service;

import com.spring.springboot.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
    void updateEmployee(Employee employee);
    List<Employee> findAllByName(String name);
}
