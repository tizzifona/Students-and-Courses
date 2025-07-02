package femcoders.java.students_courses.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue
    Long id;

    private String title;

    // Course has many students
    @ManyToMany(mappedBy = "courses")
    @JsonIgnore
    private Set<Student> students;

    // Many courses can belong to one instructor
    @ManyToOne
    private Instructor instructor;

    public Course(Long id, String title, Set<Student> students, Instructor instructor) {
        this.id = id;
        this.title = title;
        this.students = students;
        this.instructor = instructor;
    }

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
