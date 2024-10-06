package com.ust.Employeeinfo.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    private long projectId;
    private String projectName;
    private String projectDescription;
    private String projectManager;
    private String teamMembers;
    private String projectStatus;
    private String projectStartDate;
    private String projectEndDate;
    private String projectBudget;
    private String companyName;
    private long ccode;
}
