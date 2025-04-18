package com.morais.clientes.apresentacao;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;
import com.morais.clientes.logicanegocio.Cadastro;
import com.morais.clientes.logicanegocio.LogicaCadastroCliente;
import com.morais.clientes.logicanegocio.LogicaCadastroMemoria;
import estudo.exceptions.CpfInvalidoException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

public class TelaCadastro extends JFrame {

    private JLabel labelNome;
    private JLabel labelCPF;
    private JLabel labelSexo;
    private JLabel labelFoto;

    private JTextField campoNome;
    private JTextField campoCpf;
    private JComboBox<TipoSexo> campoSexo;

    private JButton botaoSalvar;
    private JButton botaoEscolherFoto;

    private Cadastro<Cliente> logicaCadastro = new LogicaCadastroMemoria();

    public TelaCadastro() {
        construirTela();
    }

    private void construirTela() {
        setTitle("Cadastro Cliente");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        this.adicionarCampos();
        this.adicionarBotoes();
        this.adicionarComponentesFoto();
    }

    private void adicionarCampos(){
        labelNome = new JLabel("Nome: ");
        labelNome.setBounds(20,20,200,20);
        getContentPane().add(labelNome);
        campoNome = new JTextField();
        campoNome.setBounds(20,40,200,20);
        getContentPane().add(campoNome);


        labelCPF = new JLabel("CPF: ");
        labelCPF.setBounds(20,100,200,20);
        getContentPane().add(labelCPF);
        campoCpf = new JTextField();
        campoCpf.setBounds(20,120,200,20);
        getContentPane().add(campoCpf);


        labelSexo = new JLabel("Sexo: ");
        labelSexo.setBounds(20,180,200,20);
        getContentPane().add(labelSexo);
        TipoSexo[] tipoSexo = {null , TipoSexo.M, TipoSexo.F, TipoSexo.O};
        campoSexo = new JComboBox<TipoSexo>(tipoSexo);
        campoSexo.setBounds(20,200,200,20);
        getContentPane().add(campoSexo);
    }

    private void adicionarBotoes(){
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(20,250,200,20);

        ActionListener acaoBotaoSalvar = this.botaoSalvarActionListener();
        botaoSalvar.addActionListener(acaoBotaoSalvar);

        getContentPane().add(botaoSalvar);

    }

    private void adicionarComponentesFoto(){

        String caminhoArquivo = "/com/morais/clientes/apresentacao/images.png";
        URL localizacao = getClass().getResource(caminhoArquivo);
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(localizacao);

        Image imgRedimencionada = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(imgRedimencionada);

        labelFoto = new JLabel();
        labelFoto.setIcon(imageIcon);
        labelFoto.setBounds(240,30,200,200);

        getContentPane().add(labelFoto);

        botaoEscolherFoto = new JButton("Alterar Foto");
        botaoEscolherFoto.setBounds(260,200,160,20);
        botaoEscolherFoto.addActionListener(this.botaoEscolherFotoActionListener());

        getContentPane().add(botaoEscolherFoto);
    }

    private ActionListener botaoEscolherFotoActionListener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int opcao = fileChooser.showOpenDialog(TelaCadastro.this);

                if (opcao == JFileChooser.APPROVE_OPTION) {
                    File arquivoSelecionado = fileChooser.getSelectedFile();
                    String caminhoArquivo = arquivoSelecionado.getAbsolutePath();

                    ImageIcon imageIcon;
                    imageIcon = new ImageIcon(caminhoArquivo);

                    Image imgRedimencionada = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                    imageIcon = new ImageIcon(imgRedimencionada);

                    labelFoto.setIcon(imageIcon);

                } else if (opcao == JFileChooser.CANCEL_OPTION) {

                } else {

                }

            }
        };
    }

    private ActionListener botaoSalvarActionListener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente(campoNome.getText(),
                        campoCpf.getText(),
                        (TipoSexo) campoSexo.getSelectedItem());

                try {
                    logicaCadastro.salvar(cliente);
                    logicaCadastro.imprimirRegistros();
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }


            }
        };
    }
}
