package entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "teacher_discipline")
@IdClass(TeacherDisciplinePK.class)
public class TeacherDiscipline {
    @Id
    @Column(name = "teacher_id", nullable = false)
    private int teacherId;

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

    @OneToMany(mappedBy = "teacherDiscipline")
    private Collection<ClassDiscipline> classDisciplines;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "id", nullable = false)
    private Teacher teacherByTeacherId;

    @ManyToOne
    @JoinColumn(name = "discipline_id", referencedColumnName = "id", nullable = false)
    private Discipline disciplineByDisciplineId;

}
