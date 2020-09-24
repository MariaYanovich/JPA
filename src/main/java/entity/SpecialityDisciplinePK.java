package entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class SpecialityDisciplinePK implements Serializable {
    @Id
    @Column(name = "speciality_id", nullable = false)
    private int specialityId;

    @Id
    @Column(name = "discipline_id", nullable = false)
    private int disciplineId;
}
