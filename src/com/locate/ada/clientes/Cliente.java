package com.locate.ada.clientes;

import javax.crypto.Cipher;
import java.util.Objects;

public class Cliente {

    private String nome;
    private String documento;
    private String tipo;

    public Cliente() {
    }

    public Cliente(String nome, String documento, String tipo) {
        this.nome = nome;
        this.documento = documento;
        this.tipo = tipo;

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
        return "Nome - '" + nome + '\'' +
                "Documento -'" + documento + '\'' +
                "Tipo do Cliente'" + tipo +'\'';
    }
}
