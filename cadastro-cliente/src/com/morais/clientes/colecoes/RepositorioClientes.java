package com.morais.clientes.colecoes;

import com.morais.clientes.dominio.Cliente;

public class RepositorioClientes {
    private Cliente[] arrayClientes;
    private static int posicaoAtual = 0;

    public RepositorioClientes() {
        this.arrayClientes = new Cliente[1000];
    }

    public void adicionarCliente(Cliente cliente) {
        this.arrayClientes[posicaoAtual] = cliente;
        posicaoAtual++;
    }

    public void imprimirClientes() {
        for (Cliente cliente : this.arrayClientes) {
            if (cliente != null) {
                System.out.println(cliente);
            }
        }
    }
}
