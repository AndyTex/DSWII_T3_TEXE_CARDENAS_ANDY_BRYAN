package pe.edu.cibertec.DSWII_T3_TexeAndy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @Column(name = "IdAlumno",nullable = false)
    private String idAlumno;
    @Column(name = "ApeAlumno",nullable = false)
    private String apeAlumno;
    @Column(name = "NomAlumno",nullable = false)
    private  String nomAlumno;
    @Column(name = "Proce")
    private char proce;
    @ManyToOne
    @JoinColumn(name = "IdEsp",nullable = false)
    private Especialiadad especialiadad;

}
