package pe.edu.cibertec.DSWII_T3_TexeAndy.model.pk;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class NotasId implements Serializable {
    private String idAlumno;
    private String idCurso;


}
