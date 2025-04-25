package com.morais.clientes.apresentacao;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;
import com.morais.clientes.logicanegocio.Cadastro;
import com.morais.clientes.logicanegocio.LogicaCadastroCliente;
import com.morais.clientes.logicanegocio.LogicaCadastroMemoria;
import com.morais.clientes.utilitario.ConversorIconParaByteArray;
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

        ImageIcon imageIcon = obterImagemPadraoFoto();

        labelFoto = new JLabel();
        labelFoto.setIcon(imageIcon);
        labelFoto.setBounds(240,30,200,200);

        getContentPane().add(labelFoto);

        botaoEscolherFoto = new JButton("Alterar Foto");
        botaoEscolherFoto.setBounds(260,200,160,20);
        botaoEscolherFoto.addActionListener(this.botaoEscolherFotoActionListener());

        getContentPane().add(botaoEscolherFoto);
    }

    private ImageIcon obterImagemPadraoFoto() {
        String caminhoArquivo = "/com/morais/clientes/apresentacao/images.png";
        URL localizacao = getClass().getResource(caminhoArquivo);
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(localizacao);

        Image imgRedimencionada = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(imgRedimencionada);
        return imageIcon;
    }

    private ActionListener botaoEscolherFotoActionListener(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser(); //escolher arquivo
                int opcao = fileChooser.showOpenDialog(TelaCadastro.this); //abrir janela

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
                byte[] byteArray = ConversorIconParaByteArray.converter(labelFoto.getIcon());

                Cliente cliente = new Cliente(campoNome.getText(),
                        campoCpf.getText(),
                        (TipoSexo) campoSexo.getSelectedItem(),
                        byteArray);


                try {
                    logicaCadastro.salvar(cliente);

                    campoNome.setText("");
                    campoCpf.setText("");
                    campoSexo.setSelectedIndex(0);
                    labelFoto.setIcon(obterImagemPadraoFoto());

                    JOptionPane.showMessageDialog(TelaCadastro.this, "Salvo com sucesso!");
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }


            }
        };
    }
}
