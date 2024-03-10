package com.jt.ems.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeAge;
    private LocalDate employeeDoj;
    private String employeeDesignation;
    private double employeeSalary;



}
