package estudo.record;

// dataclass
// no record o construtor ja é na inicalização
// Basicamente uma classe Final onde os atributos são definidos na inicialização e não podem ser modificados, métodos getters ja inseridos
// Para alterar alguma informação teria de alterar a instancia dentro da propria instancia k
public record PessoaRecord(/*Construtor*/ String nome, String cpf) {

    //metodos podem ser construidos normalmente
    public String getCPFSemFormatacao(){
        //000.000.000-00
        return this.cpf.replace(".", "").replace("-", "");
    }

    public PessoaRecord alterarNome(String nome) {
        return new PessoaRecord(nome, this.cpf());
    }
}
