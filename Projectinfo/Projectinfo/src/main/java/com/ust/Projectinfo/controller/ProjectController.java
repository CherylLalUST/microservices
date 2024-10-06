package com.ust.Projectinfo.controller;

import com.ust.Projectinfo.dto.ProjectDto;
import com.ust.Projectinfo.model.Project;
import com.ust.Projectinfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/addproject")
    public ResponseEntity<Project> addProject(@RequestBody ProjectDto project){
        return new ResponseEntity<>(projectService.addproject(project), HttpStatus.CREATED);
    }

    @GetMapping("/project/{ccode}")
    public ResponseEntity<List<Project>> getProject(@PathVariable Long ccode){
        return ResponseEntity.ok(projectService.getProjectsByCcode(ccode));
    }
}
