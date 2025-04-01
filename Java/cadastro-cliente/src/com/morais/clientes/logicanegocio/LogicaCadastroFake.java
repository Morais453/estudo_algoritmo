package com.morais.clientes.logicanegocio;

import com.morais.clientes.dominio.Cliente;

import javax.swing.*;
import java.util.UUID;

public class LogicaCadastroFake implements Cadastro<Cliente> {
    @Override
    public void salvar(Cliente cliente) {
        JOptionPane.showMessageDialog(null, cliente);
    }

    @Override
    public Cliente buscar(UUID codigo) {
        return null;
    }

    @Override
    public void deletar(UUID codigo) {

    }

    @Override
    public void Atualizar(Cliente objetoAtualizar) {

    }
}
