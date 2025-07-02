package femcoders.java.students_courses.service;

import femcoders.java.students_courses.model.Course;
import femcoders.java.students_courses.model.Student;
import femcoders.java.students_courses.repository.CourseRepository;
import femcoders.java.students_courses.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public ProjectService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
