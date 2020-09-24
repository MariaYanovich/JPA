package entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "speciality")
public class Speciality {
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

    @OneToMany(mappedBy = "specialityBySpecialityId")
    private Collection<Class> classesById;

    @OneToMany(mappedBy = "specialityBySpecialityId")
    private Collection<SpecialityDiscipline> specialityDisciplinesById;
}
