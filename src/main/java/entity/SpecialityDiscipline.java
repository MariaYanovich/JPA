package entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "speciality_discipline")
@IdClass(SpecialityDisciplinePK.class)
public class SpecialityDiscipline {
    @Id
    @Column(name = "speciality_id", nullable = false)
    private int specialityId;

    @Id
    @Column(name = "discipline_id", nullable = false)
    private int disciplineId;

    @Temporal(TemporalType.DATE)
    @Column(name = "begin_date", nullable = false)
    private Date beginDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_date")
    private Date endDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Timestamp created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted")
    private Timestamp deleted;

    @ManyToOne
    @JoinColumn(name = "discipline_id", referencedColumnName = "discipline_id", nullable = false)
    private ClassDiscipline classDisciplineByDisciplineId;

    @ManyToOne
    @JoinColumn(name = "speciality_id", referencedColumnName = "id", nullable = false)
    private Speciality specialityBySpecialityId;

    @ManyToOne
    @JoinColumn(name = "discipline_id", referencedColumnName = "id", nullable = false)
    private Discipline disciplineByDisciplineId;
}
