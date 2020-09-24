package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


@Data
public class TeacherDisciplinePK implements Serializable {
    @Id
    @Column(name = "teacher_id", nullable = false)
    private int teacherId;

    @Id
    @Column(name = "discipline_id", nullable = false)
    private int disciplineId;
}
