package com.jt.ems.service;

import com.jt.ems.model.Employee;

import java.time.LocalDate;

public interface IEmployee {
    Employee addEmployee(Employee employee);
    Employee getByLastName(String lastName);
    Employee getByFirstName(String firstName);
    Employee getByDesignation(String designation);
    Employee getById(long id);
    Employee getByLastNameAndFirstName(String lastName,String firstName);
    Employee getByFirstNameOrLastName(String firstName,String lastName);
    Employee getStartDateBetween(LocalDate startDate1, LocalDate startDate2);
    Employee getAgeLessThan(int age);
    Employee getEmployeeAgeByNull();
    Employee getEmployeeByFirstLetter(String letter);
    Employee getEmployeeByFirstNameIgnoreCase(String firstName);


}
