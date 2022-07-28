package com.sicredi.teste.domain.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Socio {

    private String codSocio;

    private String nuConta;

    private String saldo;

    private String status;

    private boolean resposta;

}
