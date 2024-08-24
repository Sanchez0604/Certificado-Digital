package com.jpedro.API_Cert.models;

import jakarta.persistence.Entity;

@Entity
public class Mensagem {
    private int id;
    private String texto;

    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
