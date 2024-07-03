package pe.edu.cibertec.DSWII_T3_TexeAndy.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
