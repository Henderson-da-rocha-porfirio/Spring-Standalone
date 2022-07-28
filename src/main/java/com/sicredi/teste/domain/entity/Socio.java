package com.sicredi.teste.domain.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Socio {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String codSocio;
    private String nuConta;
    private String saldo;
    private String status;
    private boolean resposta;

}
