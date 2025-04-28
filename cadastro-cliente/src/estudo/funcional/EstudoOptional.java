package estudo.funcional;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;
import com.morais.clientes.logicanegocio.LogicaCadastroMemoria;

import java.util.Optional;
import java.util.UUID;

//serve para trabalhar com valores nulos ou não

public class EstudoOptional {
    static Optional<Cliente> clienteVazio(){
        return Optional.empty();
    }

    static Optional<Cliente> clientePopulado(){
        var cliente = new Cliente("Morais","00011122233", TipoSexo.M);

        return Optional.of(cliente);
    }

    public static void main(String[] args) {

        Optional<Cliente> clienteVazio = clienteVazio();

        // se o cliente for vazio retorna o que vier no parentese
        var cliente = clienteVazio.orElse(new Cliente());
        System.out.println(cliente);
    }

    private static void exemploBasicoOptional() {
        var cliente = new Cliente();
        cliente.setNome("Marquin");
        Optional<Cliente> possivelCliente = Optional.ofNullable(cliente);
        if (possivelCliente.isPresent()) {
            cliente = possivelCliente.get();

            System.out.println(cliente.getNome());

        }
        if (possivelCliente.isEmpty()){

            System.out.println("Cliente não encontrado");
        }

        var logica = new LogicaCadastroMemoria();
        var clienteEncontrado = logica.buscar(UUID.randomUUID());

        System.out.println(clienteEncontrado);
    }
}
