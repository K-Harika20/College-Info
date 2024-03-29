package com.example.CollegeInfo.controller;

import com.example.CollegeInfo.model.Faculty;
import com.example.CollegeInfo.service.Facultyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/faculty")

public class Facultycontroller {
    @Autowired
    private Facultyservice facultyService;

    @PostMapping
    public Faculty addFaculty(@RequestBody Faculty faculty) {
        Faculty addedFaculty = facultyService.addFaculty(faculty);
        return addedFaculty;
    }

    @GetMapping("/department/{departmentName}")
    public List<Faculty> getFacultiesByDepartmentName(@PathVariable String departmentName) {
        List<Faculty> faculties = facultyService.getFacultiesByDepartmentName(departmentName);
        return faculties;
    }

}
