package com.ust.Projectinfo.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {

    private long projectId;

    @NotNull(message = "project name cannot be null")
    private String projectName;

    @NotNull(message = "project description cannot be null")
    @Size(min = 10, max = 500, message = "project description must be between 10 and 500 characters")
    private String projectDescription;

    @NotNull(message = "project manager cannot be null")
    private String projectManager;

    @Min(value = 2,message = "team members should be atleast 2")
    @Max(value = 200, message = "team members should be atmost 200")
    private String teamMembers;

    @Pattern(regexp = "^(InProgress|Completed)$", message = "invalid project status")
    private String projectStatus;

    @NotNull(message = "project start date should not be null")
    private String projectStartDate;

    @NotNull(message = "project end date should not be null")
    private String projectEndDate;

    @Min(value = 1000,message = "project budget should be atleast 1000")
    private String projectBudget;

    @NotBlank(message = "company name cannot be blank")
    private String companyName;

    private long ccode;

}
