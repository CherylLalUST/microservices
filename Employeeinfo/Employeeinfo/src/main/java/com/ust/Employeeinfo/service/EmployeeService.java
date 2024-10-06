package com.ust.Employeeinfo.service;

import com.ust.Employeeinfo.client.FullResponse;
import com.ust.Employeeinfo.client.Project;
import com.ust.Employeeinfo.fegin.ProjectClient;
import com.ust.Employeeinfo.model.Employee;
import com.ust.Employeeinfo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectClient projectClient;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public FullResponse getEmployeesByCcode(Long ccode) {

        Employee employee = employeeRepository.findByCcode(ccode).orElse(null);
        List<Project> list = projectClient.getProjectsByCcode(ccode);

        FullResponse fullResponse = new FullResponse();

        fullResponse.setName(employee.getName());
        fullResponse.setDepartment(employee.getDepartment());
        fullResponse.setDesignation(employee.getDesignation());
        fullResponse.setCcode(employee.getCcode());
        fullResponse.setEmail(employee.getEmail());
        fullResponse.setPhone(employee.getPhone());
        fullResponse.setAddress(employee.getAddress());
        fullResponse.setCity(employee.getCity());
        fullResponse.setState(employee.getState());
        fullResponse.setExp(employee.getExp());
        fullResponse.setDoj(employee.getDoj());
        fullResponse.setSkills(employee.getSkills());
        fullResponse.setProjects(list);

        return fullResponse;

    }
}
