package com.locate.ada.clientes;

import javax.crypto.Cipher;
import java.util.Objects;

public class Cliente {

    private int id;
    private String nome;
    private String documento;
    private String tipo;

    public Cliente() {
    }

    public Cliente(String nome, String documento, String tipo) {
        this.nome = nome;
        this.documento = documento;
        this.tipo = tipo;
        ++id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return  "Registro ='" + id + '\'' +
                "Nome='" + nome + '\'' +
                "Documento='" + documento + '\'' +
                "Tipo='" + tipo + '\'';
    }
}
