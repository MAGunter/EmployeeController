package com.spring.springboot.dao;

import com.spring.springboot.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployees() {
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Employee newEmployee = new Employee();
        entityManager.persist(employee);
    }
    @Override
    public Employee getEmployee(int id) {
        return entityManager.find(Employee.class, id);
    }
    @Override
    public void deleteEmployee(int id){
        Employee employee = entityManager.find(Employee.class, id);
        if(employee != null){
            entityManager.remove(employee);
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }
}