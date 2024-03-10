package com.jt.ems.dto;

import java.time.LocalDate;
import java.util.Date;

public record EmployeeResponseDTO(

        long employeeId,
        String employeeFirstName,
        String employeeLastName,
        LocalDate employeeDoj,
        int employeeAge,
        String employeeDesignation,
        double employeeSalary

) {
}
