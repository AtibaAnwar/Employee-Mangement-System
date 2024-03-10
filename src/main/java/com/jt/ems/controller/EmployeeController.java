package com.jt.ems.controller;

import com.jt.ems.model.Employee;
import com.jt.ems.service.IEmployee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final IEmployee employeeService;
    @PostMapping("/{add}")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);

    }
    @GetMapping("/byLastName/{lastName}")
    public Employee getEmployeesByLastName(@PathVariable String lastName) {
        return employeeService.getByLastName(lastName);
    }
    @GetMapping("/byFirstName/{firstName}")
    public Employee getEmployeeByFirstName(@PathVariable String firstName){
        return employeeService.getByFirstName(firstName);
    }
    @GetMapping("/byDesignation/{designation}")
    public Employee getEmployeeByDesignation(@PathVariable String designation){
        return employeeService.getByDesignation(designation);
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable long id){
        return employeeService.getById(id);
    }
    @GetMapping("/get/{lastName}/{firstName}")
    public Employee getEmployeeByFirstNameAndLastName(@PathVariable String lastName,String firstName){
        return employeeService.getByLastNameAndFirstName(lastName,firstName);
    }
    @GetMapping("/extract/{firstName}/{lastName}")
    public Employee getEmployeeByFirstNameOrLastName(@PathVariable String firstName,String lastName ){
        return employeeService.getByFirstNameOrLastName(firstName,lastName);
    }
    @GetMapping("/fetch/{startDate1}/{startDate2}")
    public Employee getEmployeeByStartDate(@PathVariable LocalDate startDate1, LocalDate startDate2 ){
        return employeeService.getStartDateBetween(startDate1,startDate2);
    }
    @GetMapping("/ageLessThan/{age}")
    public  Employee getEmployeeLessThan(@PathVariable int age){
        return  employeeService.getAgeLessThan(age);
    }
    @GetMapping("/ageByNull/{age}")
    public Employee getEmployeeAgeNull(@PathVariable int age){
        return  employeeService.getEmployeeAgeByNull();
    }
    @GetMapping("/startingWith/{firstLetter}")
    public Employee getEmployeeStarting(@RequestParam String letter){
        return  employeeService.getEmployeeByFirstLetter(letter);
    }
    @GetMapping("/byIgnoreCase/{firstName}")
    public Employee getEmployeeByIgnoreCase(@PathVariable String firstName){
        return employeeService.getEmployeeByFirstNameIgnoreCase(firstName);
    }
}
