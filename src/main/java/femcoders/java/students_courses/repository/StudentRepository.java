package femcoders.java.students_courses.repository;

import femcoders.java.students_courses.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
