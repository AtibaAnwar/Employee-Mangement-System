package com.jt.ems.mapper;

import com.jt.ems.dto.EmployeeRequestDTO;
import com.jt.ems.dto.EmployeeResponseDTO;
import com.jt.ems.model.Employee;
import org.springframework.beans.BeanUtils;

public class EmployeeMapper {
    private EmployeeMapper() {
    }

    public static Employee modelMapper(EmployeeRequestDTO dto) {


        var employee = new Employee();
        BeanUtils.copyProperties(dto, employee);

        return employee;
    }
    public static EmployeeResponseDTO dtoMapper(Employee employee) {
        var employeeFirstName = employee.getEmployeeFirstName();
        var employeeLastName = employee.getEmployeeLastName();
        var employeeId = employee.getEmployeeId();
        var employeeDesignation = employee.getEmployeeDesignation();
        var employeeAge = employee.getEmployeeAge();
        var employeeDoj = employee.getEmployeeDoj();
        var employeeSalary = employee.getEmployeeSalary();

        return new EmployeeResponseDTO(
                employeeId,
                employeeFirstName,
                employeeLastName,
                employeeDoj,
                employeeAge,
                employeeDesignation,
                employeeSalary

        );
    }


    }


