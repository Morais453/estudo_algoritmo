package com.morais.clientes.logicanegocio;

import com.morais.clientes.dominio.Cliente;
import estudo.exceptions.CpfInvalidoException;

public class ValidadorCliente {
    public static void Validadar(Cliente cliente) throws CpfInvalidoException {
        if (cliente.getCpf().length() != 11) {
            throw new CpfInvalidoException("CPF com quantidade de caracteres inválido!!!");
        }
    }
}
