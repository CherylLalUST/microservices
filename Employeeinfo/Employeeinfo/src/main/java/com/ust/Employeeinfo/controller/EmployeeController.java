package com.ust.Employeeinfo.controller;

import com.ust.Employeeinfo.client.FullResponse;
import com.ust.Employeeinfo.model.Employee;
import com.ust.Employeeinfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ustemp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/withprojects/{ccode}")
    public ResponseEntity<FullResponse> getEmployeesByCcode(@PathVariable Long ccode) {
        FullResponse fullResponse = employeeService.getEmployeesByCcode(ccode);
        return ResponseEntity.ok(fullResponse);
    }
}
