package femcoders.java.students_courses.controller;

import femcoders.java.students_courses.model.Course;
import femcoders.java.students_courses.model.Student;
import femcoders.java.students_courses.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/students")
    public List<Student> students() {
        return projectService.getAllStudents();
    }

    @GetMapping("/courses")
    public List<Course> courses() {
        return projectService.getAllCourses();
    }
}
