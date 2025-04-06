package com.morais.clientes.logicanegocio;

import com.morais.clientes.dominio.Cliente;

import javax.swing.*;
import java.util.UUID;

public class LogicaCadastroCliente implements Cadastro<Cliente> {

    @Override
    public void salvar(Cliente cliente) {
        JOptionPane.showMessageDialog(null, cliente);
    }

    @Override
    public Cliente buscar(UUID codigoCadastro) {
        return null;
    }

    @Override
    public void deletar(UUID codigoCadastro) {

    }

    @Override
    public void atualizar(Cliente objetoAtualizar) {

    }

    @Override
    public void imprimirRegistros() {

    }
}
