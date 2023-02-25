package com.locate.ada.enums;

import java.math.BigDecimal;

public enum TipoVeiculo {

    PEQUENO(BigDecimal.valueOf(100)),
    MEDIO(BigDecimal.valueOf(150)),
    SUV(BigDecimal.valueOf(200));
    private final BigDecimal taxaDeAluguel;

    TipoVeiculo(BigDecimal taxaDeAluguel) {
        this.taxaDeAluguel = taxaDeAluguel;
    }

    public BigDecimal getTaxaDeAluguel() {
        return taxaDeAluguel;
    }
}
