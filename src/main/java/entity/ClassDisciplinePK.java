package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class ClassDisciplinePK implements Serializable {
    @Id
    @Column(name = "class_id", nullable = false)
    private int classId;

    @Id
    @Column(name = "discipline_id", nullable = false)
    private int disciplineId;
}
