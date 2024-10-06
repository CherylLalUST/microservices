package com.ust.Employeeinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    private Long ccode;
    private String name;
    private String department;
    private String designation;
    private String email;
    private List<String> skills;
    private String address;
    private String phone;
    private String city;
    private String state;
    private int exp;
    private String doj;

}
