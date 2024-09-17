package com.spring.springboot.service;

import com.spring.springboot.dao.EmployeeDao;
import com.spring.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
    @Override
    public void saveEmployee(Employee employee){
        employeeDao.saveEmployee(employee);
    }
    @Override
    public Employee getEmployee(int id){
        return employeeDao.getEmployee(id);
    }
    @Override
    public void deleteEmployee(int id){
        employeeDao.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }
}
