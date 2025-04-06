package com.morais.clientes.dominio;

import com.morais.clientes.dominio.enums.TipoSexo;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Cliente {
    private final UUID codigoCliente;
    private String nome;
    private String cpf;
    private TipoSexo sexo;
    private byte[] foto;

    public Cliente(String nome, String cpf, TipoSexo sexo) {
        this.codigoCliente = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public UUID getCodigoCliente() {
        return codigoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Nome = " + nome + "\n" +
                "CPF = " + cpf + "\n" +
                "Sexo = " + sexo.getDescricao();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;
        return codigoCliente.equals(cliente.codigoCliente) && Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf) && sexo == cliente.sexo && Arrays.equals(foto, cliente.foto);
    }

    @Override
    public int hashCode() {
        int result = codigoCliente.hashCode();
        result = 31 * result + Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(cpf);
        result = 31 * result + Objects.hashCode(sexo);
        result = 31 * result + Arrays.hashCode(foto);
        return result;
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
