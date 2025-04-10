package com.morais.clientes.logicanegocio;

import com.morais.clientes.dominio.Cliente;
import estudo.exceptions.CpfInvalidoException;
import estudo.exceptions.DadoObrigatorioException;

public class ValidadorCliente {
    public static void Validar(Cliente cliente){
        validarDadosObrigatorios(cliente);
    }

    private static void validarDadosObrigatorios(Cliente cliente){
        if(cliente.getNome() == null || cliente.getNome().isBlank()){
            throw new DadoObrigatorioException("Nome Obrigatório");
        } if (cliente.getCpf() == null){
            throw new DadoObrigatorioException("CPF Obrigatorio");
        } if (cliente.getCpf().length() != 11) {
            throw new DadoObrigatorioException("CPF com quantidade de caracteres inválido!!!");
        } if(cliente.getSexo() == null){
            throw new DadoObrigatorioException("Sexo Obrigatorio");
        }
    }

}
