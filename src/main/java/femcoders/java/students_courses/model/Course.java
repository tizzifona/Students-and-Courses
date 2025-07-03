package femcoders.java.students_courses.model;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue
    Long id;

    private String title;

    // Many courses can belong to one instructor
    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    public Course(Long id, String title, Instructor instructor) {
        this.id = id;
        this.title = title;
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

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
