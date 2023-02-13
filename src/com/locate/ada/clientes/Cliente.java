package com.locate.ada.clientes;

import com.locate.ada.enums.TipoPessoa;

import javax.crypto.Cipher;
import java.util.Objects;

public class Cliente {

    private String nome;
    private String documento;
    private TipoPessoa tipoPessoa;

    public Cliente() {
    }

    public Cliente(String nome, String documento, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.documento = documento;
        this.tipoPessoa = tipoPessoa;

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

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipo) {
        this.tipoPessoa = tipo;
    }

    @Override
    public String toString() {
        return "Nome - '" + nome + '\'' +
                "Documento -'" + documento + '\'' +
                "Tipo do Cliente'" + tipoPessoa +'\'';
    }
}
