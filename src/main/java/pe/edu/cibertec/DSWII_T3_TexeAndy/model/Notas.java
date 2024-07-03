package pe.edu.cibertec.DSWII_T3_TexeAndy.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.edu.cibertec.DSWII_T3_TexeAndy.model.pk.NotasId;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "notas")
public class Notas {
    @EmbeddedId
    private NotasId id;

    @ManyToOne
    @MapsId("idAlumno")
    @JoinColumn(name = "IdAlumno",nullable = false)
    private Alumno alumno;

    @ManyToOne
    @MapsId("idCurso")
    @JoinColumn(name = "IdCurso",nullable = false)
    private Curso curso;

    @Column(name = "ExaParcial")
    private float exaParcial;

    @Column(name = "ExaFinal")
    private float exaFinal;
}
