package com.morais.clientes.apresentacao;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;
import com.morais.clientes.logicanegocio.Cadastro;
import com.morais.clientes.logicanegocio.LogicaCadastroFake;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {
    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelSexo;

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<TipoSexo> campoSexo;

    private JButton botaoSalvar;

    public TelaCadastro() {
        construirTela();
    }

    private void construirTela() {
        setTitle("Cadastro de Cliente");
        setSize(600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        this.adicionarCampos();
        this.adicionarBotoes();
        this.adicionarComponentesFoto();
    }

    private void adicionarCampos() {
        labelNome = new JLabel("Nome:");
        labelNome.setBounds(20,20,200,20);
        getContentPane().add(labelNome);

        campoNome = new JTextField();
        campoNome.setBounds(20,40,200,20);
        getContentPane().add(campoNome);

        labelCpf = new JLabel("CPF:");
        labelCpf.setBounds(20,80,200,20);
        getContentPane().add(labelCpf);

        campoCpf = new JTextField();
        campoCpf.setBounds(20,100,200,20);
        getContentPane().add(campoCpf);

        labelSexo = new JLabel("Sexo:");
        labelSexo.setBounds(20,140,200,20);
        getContentPane().add(labelSexo);

        TipoSexo[] tipoSexo = {null , TipoSexo.M , TipoSexo.F , TipoSexo.O};
        campoSexo = new JComboBox<>(tipoSexo);
        campoSexo.setBounds(20,160,200,20);
        getContentPane().add(campoSexo);

    }

    private void adicionarBotoes() {
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(20,220,100,20);

        ActionListener acaoBotaoSalvar = this.botaoSalvarActionListener();
        //Adicionar ação
        botaoSalvar.addActionListener(acaoBotaoSalvar);

        getContentPane().add(botaoSalvar);
    }

    private void adicionarComponentesFoto() {

    }

    private ActionListener botaoSalvarActionListener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(campoNome.getText());
                cliente.setCpf(campoCpf.getText());
                cliente.setSexo((TipoSexo) campoSexo.getSelectedItem());

                Cadastro<Cliente> logicaCadastro = new LogicaCadastroFake();
                logicaCadastro.salvar(cliente);


            }
        };
    }
}
