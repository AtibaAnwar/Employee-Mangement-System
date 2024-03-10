package com.jt.ems.service;

import com.jt.ems.model.Employee;
import com.jt.ems.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class EmployeeImpl implements IEmployee{
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository
                .save(employee);
    }

    @Override
    public Employee getByLastName(String lastname) {
        return employeeRepository
                .findByEmployeeLastName(lastname)
                .orElseThrow();

    }

    @Override
    public Employee getByFirstName(String firstName) {
        return employeeRepository
                .findByEmployeeFirstName(firstName)
                .orElseThrow();
    }

    @Override
    public Employee getByDesignation(String designation) {

        return employeeRepository
                .findByEmployeeDesignation(designation)
                .orElseThrow();
    }

    @Override
    public Employee getById(long id) {

        return employeeRepository
                .findByEmployeeId(id)
                .orElseThrow();
    }

    @Override
    public Employee getByLastNameAndFirstName (String lastName,String firstName) {
        return employeeRepository
                .findDistinctByEmployeeLastNameAndEmployeeFirstName(lastName,firstName)
                .orElseThrow();
    }

    @Override
    public Employee getByFirstNameOrLastName(String firstName, String lastName) {
        return employeeRepository
                .findByEmployeeFirstNameOrEmployeeLastName(firstName,lastName)
                .orElseThrow();
    }

    @Override
    public Employee getStartDateBetween(LocalDate startDate1, LocalDate startDate2) {
        return employeeRepository
                .findByEmployeeDojBetween(startDate1,startDate2)
                .orElseThrow();
    }

    @Override
    public Employee getAgeLessThan(int age) {
        return employeeRepository
                .findByEmployeeAgeLessThan(age)
                .orElseThrow();
    }



    @Override
    public Employee getEmployeeAgeByNull() {
        return employeeRepository
                .findByEmployeeAgeIsNull()
                .orElseThrow();
    }

    @Override
    public Employee getEmployeeByFirstLetter(String letter) {
        return employeeRepository
                .findByEmployeeFirstNameStartingWith(letter)
                .orElseThrow();
    }

    @Override
    public Employee getEmployeeByFirstNameIgnoreCase(String firstName) {
        return employeeRepository
                .findByEmployeeFirstNameIgnoreCase(firstName)
                .orElseThrow();
    }
}
