package com.morais.clientes.dominio;

import com.morais.clientes.dominio.enums.TipoSexo;

import java.util.UUID;

public class Cliente {
    private UUID codigo;
    private String nome;
    private String cpf;
    private TipoSexo sexo;
    private byte[] fotoCliente;

    public Cliente(String nome, String cpf, TipoSexo sexo) {
        this.codigo = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", sexo=" + getSexo();
    }

    public Cliente() {
        this.codigo = UUID.randomUUID();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getCodigo() {
        return this.codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public byte[] getFotoCliente() {
        return fotoCliente;
    }

    public void setFotoCliente(byte[] fotoCliente) {
        this.fotoCliente = fotoCliente;
    }
}
