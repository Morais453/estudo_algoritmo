package com.morais.clientes;

import com.morais.clientes.apresentacao.TelaCadastro;
import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;
import com.morais.clientes.logicanegocio.Cadastro;

public class Main {
    public static void main(String[] args) {
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
    }
}