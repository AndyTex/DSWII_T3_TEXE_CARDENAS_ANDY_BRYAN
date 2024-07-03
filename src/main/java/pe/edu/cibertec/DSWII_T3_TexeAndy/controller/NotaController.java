package pe.edu.cibertec.DSWII_T3_TexeAndy.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_T3_TexeAndy.model.dto.NotasDto;
import pe.edu.cibertec.DSWII_T3_TexeAndy.service.INotasService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/pubs-dto")
public class NotaController {
    private INotasService notasService;

    @GetMapping
    public ResponseEntity<List<NotasDto>> getNotasDTOs() {
        List<NotasDto> notasDTOs = notasService.getNotasDTOs();
        return new ResponseEntity<>(notasDTOs, HttpStatus.OK);
    }
}
