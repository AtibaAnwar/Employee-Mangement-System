package com.jt.ems.repository;

import com.jt.ems.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

   
    Optional<Employee> findByEmployeeLastName(String lastName);
    Optional<Employee> findByEmployeeFirstName(String firstName);
    Optional<Employee> findByEmployeeDesignation(String designation);
    Optional<Employee> findByEmployeeId(long id);
    Optional <Employee> findDistinctByEmployeeLastNameAndEmployeeFirstName(String lastName,String firstName);
    Optional<Employee> findByEmployeeFirstNameOrEmployeeLastName(String firstName,String LastName);
    Optional<Employee> findByEmployeeDojBetween(LocalDate startDate1, LocalDate startDate2);
    Optional<Employee> findByEmployeeAgeLessThan(int age);
    Optional<Employee> findByEmployeeAgeIsNull();
    Optional<Employee> findByEmployeeFirstNameStartingWith(String letter);
    Optional<Employee> findByEmployeeFirstNameIgnoreCase(String firstName);
}
