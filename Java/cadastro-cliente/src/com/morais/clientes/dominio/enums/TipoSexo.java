package com.morais.clientes.dominio.enums;

public enum TipoSexo {
    O("Outros"),
    M("Masculino"),
    F("Feminino");

    private final String descricao;

    TipoSexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
