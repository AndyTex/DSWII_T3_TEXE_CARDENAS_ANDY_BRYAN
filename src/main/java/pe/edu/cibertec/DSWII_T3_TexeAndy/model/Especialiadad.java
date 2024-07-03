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
@Table(name = "especialidad")
public class Especialiadad {
    @Id
    @Column(name = "IdEsp", nullable = false)
    private String idEsp;
    @Column(name = "NomEsp",nullable = false)
    private  String nomEsp;
    @Column(name = "Costo",nullable = false)
    private Double costo;
}
