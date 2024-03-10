package com.jt.ems.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;

public record EmployeeRequestDTO(
        @NotNull
        long employeeId,

        @NotNull
         String employeeFirstName,
        @NotNull
        String employeeLastName,
        @NotNull
        LocalDate employeeDoj,
        @NotNull
        int employeeAge,
        @NotNull
        String employeeDesignation,
        @NotNull
        double employeeSalary


) {
}
