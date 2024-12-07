package com.food.ordering.system.cdssystem.repo;

import com.food.ordering.system.cdssystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
