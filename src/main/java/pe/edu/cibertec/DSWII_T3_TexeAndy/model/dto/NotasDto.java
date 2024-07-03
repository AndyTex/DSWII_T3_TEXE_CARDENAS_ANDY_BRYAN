package pe.edu.cibertec.DSWII_T3_TexeAndy.model.dto;

import lombok.Data;

@Data
public class NotasDto implements DtoEntity{
    private Float exaParcial;
    private Float exaFinal;
    private String nombreCurso;
    private String apellidoAlumno;
    private String nombreAlumno;
}
