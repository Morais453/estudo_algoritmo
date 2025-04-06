package com.morais.clientes.logicanegocio;

import com.morais.clientes.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class LogicaCadastroMemoria  implements Cadastro<Cliente> {

    private List<Cliente> clientesLista;

    public LogicaCadastroMemoria() {
        this.clientesLista = new ArrayList<>();
    }

    @Override
    public void salvar(Cliente cliente) {
        this.clientesLista.add(cliente);
    }

    @Override
    public Cliente buscar(UUID codigo) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : this.clientesLista) {
            if(cliente.getCodigoCliente().equals(clienteEncontrado.getCodigoCliente())) {
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }

    @Override
    public void deletar(UUID codigo) {
        Cliente clienteExcluir = this.buscar(codigo);
        if (clienteExcluir != null) {
            this.clientesLista.remove(codigo);
        } else {
            System.out.println("Cliente não encontrado");
        }

    }

    @Override
    public void atualizar(Cliente objetoAtualizar) {
        //Faz sentido em DB
    }

    @Override
    public void imprimirRegistros() {
        System.out.println("Registros imprimidos: " + clientesLista.size());
        for(Cliente cliente: this.clientesLista) {
            if(cliente != null) {
                System.out.println(cliente);
            }
        }
    }
}
