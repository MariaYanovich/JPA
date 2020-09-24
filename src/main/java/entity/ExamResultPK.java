package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class ExamResultPK implements Serializable {
    @Id
    @Column(name = "student_id", nullable = false)
    private int studentId;

    @Id
    @Column(name = "exam_id", nullable = false)
    private int examId;
}
