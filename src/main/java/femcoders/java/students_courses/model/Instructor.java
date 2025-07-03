package femcoders.java.students_courses.model;

import jakarta.persistence.*;

@Entity
public class Instructor {

    @Id
    @GeneratedValue
    Long id;

    private String name;

    public Instructor(Long id, String name) {
        this.id = id;
        this.name = name;
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

}
