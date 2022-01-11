package com.example.pruebaparameta.repository;

import com.example.pruebaparameta.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
