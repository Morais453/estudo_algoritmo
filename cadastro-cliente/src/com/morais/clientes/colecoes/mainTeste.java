package com.morais.clientes.colecoes;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;

import java.util.ArrayList;
import java.util.List;

public class mainTeste {
    public static void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        Cliente e = new Cliente("Joao", "0123456789", TipoSexo.M);
        listaClientes.add(e);
        e = new Cliente("JV","00099988876", TipoSexo.M);
        listaClientes.add(e);

        System.out.println("Lista de clientes: ");

        for (Cliente cliente : listaClientes) {
            if (cliente != null) {
                System.out.println(cliente + "\n");
            }
        }
    }

    public static void repositorioArray(){
        RepositorioClientes repositorio = new RepositorioClientes();
        Cliente cliente1 = new Cliente("Joao", "0123456789", TipoSexo.M);
        repositorio.adicionarCliente(cliente1);

        Cliente cliente2 = new Cliente("JV","00099988876", TipoSexo.M);
        repositorio.adicionarCliente(cliente2);

        repositorio.imprimirClientes();
    }
}
