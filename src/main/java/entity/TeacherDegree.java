package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Table(name = "teacher_degree")
public class TeacherDegree {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "teacherDegreeByTeacherDegreeId")
    private Collection<Teacher> teachersById;

}
