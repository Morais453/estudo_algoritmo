package Interface;

// define apenas metodos abstratos e constantes
// assinatura é tipode retorno, nome e parametro
public interface Autenticacao {
    String getIdentificacao();
    String getSenha();
    boolean isUsaSenha(String identificacao);
}
