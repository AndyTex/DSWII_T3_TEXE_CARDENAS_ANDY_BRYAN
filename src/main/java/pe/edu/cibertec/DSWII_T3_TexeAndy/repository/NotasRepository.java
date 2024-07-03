package pe.edu.cibertec.DSWII_T3_TexeAndy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_T3_TexeAndy.model.Notas;
import pe.edu.cibertec.DSWII_T3_TexeAndy.model.pk.NotasId;

@Repository
public interface NotasRepository extends JpaRepository<Notas, NotasId> {
}
