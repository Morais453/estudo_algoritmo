package com.morais.clientes.dominio;

import java.util.UUID;

public class Cliente {
    private UUID codigo;
    private String nome;
    private String cpf;
    private String sexo;
    private byte[] fotoCliente;

    public Cliente(String nome, String cpf, String sexo) {
        this.codigo = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public byte[] getFotoCliente() {
        return fotoCliente;
    }

    public void setFotoCliente(byte[] fotoCliente) {
        this.fotoCliente = fotoCliente;
    }
}
