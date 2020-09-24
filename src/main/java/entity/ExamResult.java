package entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "exam_result")
@IdClass(ExamResultPK.class)
public class ExamResult {
    @Id
    @Column(name = "student_id", nullable = false)
    private int studentId;

    @Id
    @Column(name = "exam_id", nullable = false)
    private int examId;

    @Column(name = "rating", nullable = false)
    private int rating;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
    private Student studentByStudentId;

    @ManyToOne
    @JoinColumn(name = "exam_id", referencedColumnName = "id", nullable = false)
    private Exam examByExamId;

}
