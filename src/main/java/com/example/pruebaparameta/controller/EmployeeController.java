package com.example.pruebaparameta.controller;

import com.example.pruebaparameta.entity.Employee;
import com.example.pruebaparameta.service.EmployeeServiceImpl;
import com.example.pruebaparameta.util.CalculateAge;
import com.example.pruebaparameta.util.CalculateCompanySeniority;
import com.example.pruebaparameta.util.FormatDateSplit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/save/employee")
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) throws Exception {
        FormatDateSplit formatDateSplit = new FormatDateSplit();
        formatDateSplit.getMonth(employee.getBirthdayDate());
        CalculateCompanySeniority calculateCompanySeniority = new CalculateCompanySeniority();
        Employee obj = new Employee();
        CalculateAge calculateAge = new CalculateAge();
        int age = calculateAge.CalculateAgeMax(formatDateSplit.getYear(employee.getBirthdayDate()), formatDateSplit.getMonth(employee.getBirthdayDate()), formatDateSplit.getDay(employee.getBirthdayDate()));
        if (age > 18) {
            obj = employeeService.saveEmployee(employee);
            employee.setAge(calculateAge.CalculateAgeComplete(formatDateSplit.getYear(employee.getBirthdayDate()), formatDateSplit.getMonth(employee.getBirthdayDate()), formatDateSplit.getDay(employee.getBirthdayDate())));
            employee.setCompanySeniority(calculateCompanySeniority.CompanySeniorityAge(formatDateSplit.getYear(employee.getDateJoiningCompany()), formatDateSplit.getMonth(employee.getDateJoiningCompany()), formatDateSplit.getMonth(employee.getDateJoiningCompany())));
            return new ResponseEntity<>(obj, HttpStatus.OK);
        } else {
            throw new Exception("The employee is a minor");
        }
    }

}
