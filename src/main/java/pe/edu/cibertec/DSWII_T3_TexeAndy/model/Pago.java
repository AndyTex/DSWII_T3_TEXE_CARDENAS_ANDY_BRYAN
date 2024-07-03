package pe.edu.cibertec.DSWII_T3_TexeAndy.model;

import jakarta.persistence.*;
import lombok.*;
import pe.edu.cibertec.DSWII_T3_TexeAndy.model.pk.PagosId;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pagos")
public class Pago {
    @EmbeddedId
    private PagosId id;

    @ManyToOne
    @MapsId("idAlumnno")
    @JoinColumn(name = "IdAlumno", nullable = false)
    private Alumno alumno;

    @Column(name = "Monto", nullable = false)
    private Double monto;

    @Column(name = "Fecha",columnDefinition = "DATETIME")
    private Date fecha;
}
