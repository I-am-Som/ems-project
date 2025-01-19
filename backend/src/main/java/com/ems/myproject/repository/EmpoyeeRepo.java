package com.ems.myproject.repository;

import com.ems.myproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpoyeeRepo extends JpaRepository<Employee, Long> {
}
