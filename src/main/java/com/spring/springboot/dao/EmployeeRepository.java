package com.spring.springboot.dao;

import com.spring.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Spring автоматический понимает что это репозиторий из за JpaRepository и аннотацию указывать не надо
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}
