package pe.edu.cibertec.DSWII_T3_TexeAndy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @Column(name = "IdCurso",nullable = false)
    private String idCurso;
    @Column(name = "NomCurso",nullable = false)
    private String nomCurso;
    @Column(name = "Credito")
    private  int credito;
}
