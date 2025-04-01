package com.morais.clientes.logicanegocio;

import java.util.UUID;

// define apenas metodos abstratos e constantes
// assinatura é tipode retorno, nome e parametro
public interface Cadastro<TIPO> {
    void salvar(TIPO objetoCadastrar);

    TIPO buscar(UUID codigo);

    void deletar(UUID codigo);

    void Atualizar(TIPO objetoAtualizar);
}
