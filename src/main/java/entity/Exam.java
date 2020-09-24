package entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    private Date date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
    private Timestamp created;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted")
    private Timestamp deleted;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "class_id", referencedColumnName = "class_id", nullable = false), @JoinColumn(name = "discipline_id", referencedColumnName = "discipline_id", nullable = false)})
    private ClassDiscipline classDiscipline;

    @OneToMany(mappedBy = "examByExamId")
    private Collection<ExamResult> examResultsById;
}
