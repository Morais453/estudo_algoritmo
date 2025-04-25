package com.morais.clientes.dominio;

import com.morais.clientes.dominio.enums.TipoSexo;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Cliente implements Comparable<Cliente> {

    private final UUID codigoCliente;
    private String nome;
    private String cpf;
    private TipoSexo sexo;
    private Integer idade;
    private Boolean ativo;
    private byte[] foto;

    public Cliente(String nome, String cpf, TipoSexo sexo) {
        this.codigoCliente = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }
    public Cliente(String nome, String cpf, TipoSexo sexo, byte[] foto) {
        this.codigoCliente = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.foto = foto;
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + "\n" +
                "CPF = " + cpf + "\n" +
                "Sexo = " + sexo.getDescricao() +"\n"+
                "Foto = " + foto;
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

    @Override
    public int compareTo(Cliente o) {
        int fator = this.nome.compareTo(o.getNome());
        if (fator == 0) {
            fator = this.sexo.equals(TipoSexo.M) ? 1 : -1;
        }

        return fator;
    }
}
