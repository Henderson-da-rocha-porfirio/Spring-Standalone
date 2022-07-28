package com.sicredi.teste.api.controller;

import com.sicredi.teste.domain.service.ReceitaCsvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping(value = "/sincronizar")
public class ReceitaController {

    @Autowired
    private ReceitaCsvService receitaCsvService;

    @RequestMapping(path = "/exportar")
    public ResponseEntity<Void> exportarParaCSV(HttpServletResponse servletResponse) throws IOException {
        servletResponse.setContentType("text/csv");
        servletResponse.addHeader("Content-Disposition", "attachment; filename=\"arquivo.csv\"");
        receitaCsvService.exportarCsv(servletResponse.getWriter());
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
