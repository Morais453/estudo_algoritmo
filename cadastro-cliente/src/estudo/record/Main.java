package estudo.record;

public class Main {
    public static void main(String[] args) {
        var Pessoa = new Pessoa("Fulano", "123");
        String nome = Pessoa.getNome();

        var PessoaRecord = new PessoaRecord("Ciclano", "456");
        String nomeRecord = PessoaRecord.nome();

        System.out.println(nome + ", " + nomeRecord);

        PessoaRecord = PessoaRecord.alterarNome("Ciclano de Sousa");
        System.out.println(PessoaRecord.nome());
    }
}
