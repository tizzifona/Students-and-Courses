package femcoders.java.students_courses.repository;

import femcoders.java.students_courses.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
