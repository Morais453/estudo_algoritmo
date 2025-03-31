package com.morais.clientes.apresentacao;

import javax.swing.*;

public class TelaCadastro extends JFrame {
    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;

    public TelaCadastro() {
        construirTela();
    }

    private void construirTela() {
        setTitle("Cadastro de Cliente");
        setSize(600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    }
}
