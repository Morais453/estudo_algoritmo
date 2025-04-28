package estudo.funcional;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfacesFuncionais {
    public static void main(String[] args) {
        var interfacesFuncionais = new InterfacesFuncionais();
        System.out.println("Supplier");
        interfacesFuncionais.supplier();

        System.out.println("Consumer");
        interfacesFuncionais.consumer();

        System.out.println("Predicate");
        interfacesFuncionais.predicate();

        System.out.println("Function");
        interfacesFuncionais.function();
    }


    // interface funcional cujo unico objetivo é retornar o objeto, fazendo a instancia apenas quando chama o método
    public void supplier(){
        Supplier<Cliente> provedorCliente = () -> new Cliente();
        System.out.println(provedorCliente.get());
    }

    // consumir um valor e fazer algo com ele
    public void consumer(){
        Consumer<Cliente> impressorNome = (cliente) -> System.out.println(cliente.getNome());

        Cliente cliente = new Cliente();
        cliente.setNome("Zé da manga");
        impressorNome.accept(cliente);
    }

    //Vai avaliar algo e retornar verdadeiro ou falso
    public void predicate(){
        Predicate<Cliente> verificaSeMulher = cliente -> TipoSexo.F.equals(cliente.getSexo());

        Cliente cliente = new Cliente();
        cliente.setSexo(TipoSexo.M);
        System.out.println(verificaSeMulher.test(cliente));
    }

    //mapeia um valor para outro 1º é entrada 2º saida
    public void function(){
        Function<Cliente, String> mapearNome = (cliente) -> cliente.getNome();

        Cliente cliente = new Cliente();
        cliente.setNome("Maria");

        String nome = mapearNome.apply(cliente);
        System.out.println(nome);

        System.out.println(mapearNome.apply(cliente));
    }
}
