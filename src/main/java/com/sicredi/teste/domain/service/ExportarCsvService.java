package com.sicredi.teste.domain.service;

import com.sicredi.teste.domain.response.Socio;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;

@Service
public class ExportarCsvService {

    @Autowired
    private ReceitaService receitaService;

    public void exportarCsv(Writer writer){
        String line = "";
        String splitBy = ";";
        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.csv"));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            while ((line = br.readLine()) != null) {

                String[] associado = line.split(splitBy);
                Socio socio = new Socio(associado[0], associado[1], associado[2], associado[3], receitaService.atualizarConta(associado[0], associado[1], associado[2], associado[3]));
                csvPrinter.printRecord(socio.getCodSocio(), socio.getNuConta(), socio.getSaldo(), socio.getStatus(), socio.isResposta());
            }
        }
        catch (IOException | InterruptedException e)  {
            e.printStackTrace();
        }
    }
}
