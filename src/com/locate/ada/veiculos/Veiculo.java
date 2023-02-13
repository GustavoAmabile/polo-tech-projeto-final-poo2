package com.locate.ada.veiculos;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String tipo;
    private boolean disponivel = true;

    public Veiculo() {
    }

    public Veiculo(String placa, String marca,String modelo, String tipo) {

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Placa='" + placa + '\'' +
                "Marca='" + marca + '\'' +
                "Modelo='" + modelo +'\'' +
                "Tipo='" + tipo;
    }
}
