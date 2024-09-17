package com.spring.springboot.service;

import com.spring.springboot.dao.EmployeeRepository;
import com.spring.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//JpaRepository обеспечивает @Transactional, поэтому нет смысла писать эту аннотацию
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }
    @Override
    public void saveEmployee(Employee employee){
        employeeDao.save(employee);
    }
    @Override
    public Employee getEmployee(int id){
        Employee emp = null;
        Optional<Employee> optionalEmployee = employeeDao.findById(id);
        if(optionalEmployee.isPresent()){
            emp = optionalEmployee.get();
        }
        return emp;
    }
    @Override
    public void deleteEmployee(int id){
        employeeDao.deleteById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employees = employeeDao.findAllByName(name);
        return employees;
    }
}
