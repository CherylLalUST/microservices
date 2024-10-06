package com.ust.Employeeinfo.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FullResponse {
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
    public List<Project> projects;
}
