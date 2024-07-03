package pe.edu.cibertec.DSWII_T3_TexeAndy.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_TexeAndy.model.Notas;
import pe.edu.cibertec.DSWII_T3_TexeAndy.model.dto.NotasDto;
import pe.edu.cibertec.DSWII_T3_TexeAndy.repository.NotasRepository;
import pe.edu.cibertec.DSWII_T3_TexeAndy.util.DtoUtil;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class NotasService implements INotasService {

    private NotasRepository notasRepository;
    private DtoUtil dtoUtil;

    @Override
    public List<NotasDto> getNotasDTOs() {
        List<Notas> notasList = notasRepository.findAll();
        return notasList.stream().map(notas -> {
            NotasDto notasDto = (NotasDto) dtoUtil.convertirADto(notas,new NotasDto());
            notasDto.setNombreCurso(notas.getCurso().getNomCurso());
            notasDto.setApellidoAlumno(notas.getAlumno().getApeAlumno());
            notasDto.setNombreAlumno(notas.getAlumno().getNomAlumno());
            return notasDto;
        }) .collect(Collectors.toList());
    }
}
