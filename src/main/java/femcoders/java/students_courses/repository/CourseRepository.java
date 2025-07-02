package femcoders.java.students_courses.repository;

import femcoders.java.students_courses.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
