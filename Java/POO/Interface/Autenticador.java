package Interface;

public class Autenticador {
    public boolean autenticar(Autenticacao autenticacao) {
         String identificacao = autenticacao.getIdentificacao();

         if (autenticacao.isUsaSenha(identificacao)){
             boolean verificacao = autenticacao.getSenha().equals(inputSenha);
             return verificacao;
         } else {
             // identificacao in db
             return true;
         }
    }

    private String inputSenha;
}
