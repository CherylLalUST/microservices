package com.ust.Projectinfo.service;

import com.ust.Projectinfo.dto.ProjectDto;
import com.ust.Projectinfo.model.Project;
import com.ust.Projectinfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project addproject(ProjectDto project) {
        Project project1 = new Project();
        project1.setProjectId(project.getProjectId());
        project1.setProjectName(project.getProjectName());
        project1.setProjectManager(project.getProjectManager());
        project1.setTeamMembers(project.getTeamMembers());
        project1.setProjectStatus(project.getProjectStatus());
        project1.setProjectStartDate(project.getProjectStartDate());
        project1.setProjectEndDate(project.getProjectEndDate());
        project1.setProjectBudget(project.getProjectBudget());
        project1.setCompanyName(project.getCompanyName());
        project1.setCcode(project.getCcode());

        return projectRepository.save(project1);
    }

    public List<Project> getProjectsByCcode(Long ccode) {
        return projectRepository.findAllByCcode(ccode);
    }
}
