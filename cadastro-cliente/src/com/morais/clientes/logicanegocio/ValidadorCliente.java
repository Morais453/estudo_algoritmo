package com.morais.clientes.logicanegocio;

import com.morais.clientes.dominio.Cliente;
import estudo.exceptions.CpfInvalidoException;
import estudo.exceptions.DadoObrigatorioException;

public class ValidadorCliente {
    public static void Validar(Cliente cliente) throws CpfInvalidoException {
        if (cliente.getCpf().length() != 11) {
            throw new CpfInvalidoException("CPF com quantidade de caracteres inválido!!!");
        }
        validarDadosObrigatorios(cliente);
    }

    private static void validarDadosObrigatorios(Cliente cliente){
        if(cliente.getNome() == null || cliente.getNome().equals("")){
            throw new DadoObrigatorioException("Nome Obrigatório");
        } if(cliente.getSexo() == null){
            throw new DadoObrigatorioException("Sexo Obrigatorio");
        }
    }

}
