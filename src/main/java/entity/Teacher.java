package entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Timestamp created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted")
    private Timestamp deleted;

    @ManyToOne
    @JoinColumn(name = "teacher_degree_id", referencedColumnName = "id")
    private TeacherDegree teacherDegreeByTeacherDegreeId;

    @OneToMany(mappedBy = "teacherByTeacherId")
    private Collection<TeacherDiscipline> teacherDisciplinesById;

}
