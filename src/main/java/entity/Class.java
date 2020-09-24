package entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "class")
public class Class {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "begin_date", nullable = false)
    private Date beginDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Timestamp created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted")
    private Timestamp deleted;

    @ManyToOne
    @JoinColumn(name = "speciality_id", referencedColumnName = "id", nullable = false)
    private Speciality specialityBySpecialityId;

    @OneToMany(mappedBy = "classByClassId")
    private Collection<ClassDiscipline> classDisciplinesById;

    @OneToMany(mappedBy = "classByClassId")
    private Collection<Student> studentsById;
}
