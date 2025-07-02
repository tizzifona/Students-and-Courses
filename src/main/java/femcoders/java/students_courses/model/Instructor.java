package femcoders.java.students_courses.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Instructor {

    @Id
    @GeneratedValue
    Long id;

    private String name;

    // Optional: mappedBy = "instructor" if you want bidirectional access
    @OneToMany(mappedBy = "instructor")
    @JsonIgnore
    private Set<Course> courses;

    public Instructor(Long id, String name, Set<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public Instructor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
