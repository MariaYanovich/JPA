package entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@Table(name = "class_discipline")
@IdClass(ClassDisciplinePK.class)
public class ClassDiscipline {
    @Id
    @Column(name = "class_id", nullable = false)
    private int classId;

    @Id
    @Column(name = "discipline_id", nullable = false)
    private int disciplineId;

    @Temporal(TemporalType.DATE)
    @Column(name = "begin_date", nullable = false)
    private Date beginDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "class_id", referencedColumnName = "id", nullable = false)
    private Class classByClassId;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "teacher_id", referencedColumnName = "teacher_id", nullable = false), @JoinColumn(name = "discipline_id", referencedColumnName = "discipline_id", nullable = false)})
    private TeacherDiscipline teacherDiscipline;

    @OneToMany(mappedBy = "classDiscipline")
    private Collection<Exam> exams;
}
