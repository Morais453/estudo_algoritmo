package com.morais.clientes.logicanegocio;

import estudo.exceptions.CpfInvalidoException;

import java.util.UUID;

//<>  <--Generaliza o tipo que sera implementado
//interface é um modelo de classe que contém métodos abstratos e constantes
// Ela define um contrato que as classes que a implementam devem seguir
public interface Cadastro<TIPO> {
    void salvar(TIPO objetoCadastrar) throws Exception;
    TIPO buscar(UUID codigoCadastro);
    void deletar(UUID codigoCadastro);
    void atualizar(TIPO objetoAtualizar);
    void imprimirRegistros();
}
