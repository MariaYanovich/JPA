package entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "discipline")
public class Discipline {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Timestamp created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted")
    private Timestamp deleted;

    @OneToMany(mappedBy = "disciplineByDisciplineId")
    private Collection<SpecialityDiscipline> specialityDisciplinesById;

    @OneToMany(mappedBy = "disciplineByDisciplineId")
    private Collection<TeacherDiscipline> teacherDisciplinesById;
}
