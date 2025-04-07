package estudo.colecoes;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;

import java.util.*;

public class mainTeste {
    public static void main(String[] args) {
        OrganizacaoClientes cadastro = new OrganizacaoClientes();
        Cliente e = new Cliente("Thiago", "00011122234", TipoSexo.M);
        cadastro.adicionaCliente(e);
        Cliente f = new Cliente("Carla", "00011122234", TipoSexo.F);
        cadastro.adicionaCliente(f);

        System.out.println("Cadastros Femininos");
        cadastro.imprimirClientes(TipoSexo.F);
        System.out.println("Cadastros Mascuinos");
        cadastro.imprimirClientes(TipoSexo.M);
        System.out.println("Cadastros Outros");
        cadastro.imprimirClientes(TipoSexo.O);
    }

    private static void exemploMaps() {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "A");
        mapa.put(2, "B");
        mapa.put(3, "C");

        String item = mapa.get(3);
        System.out.println(item);

        mapa.remove(2);
    }

    private static void trabalhandoComOrdenacao() {
        Cliente c = new Cliente("Thiago", "00011122234", TipoSexo.M);

        Cliente d = new Cliente("Thiago", "000", TipoSexo.F);
        List<Cliente> clientes = Arrays.asList(c,d);

        clientes.sort(Cliente::compareTo);

        System.out.println("Lista de clientes: ");

        for (Cliente cliente : clientes) {
            if (cliente != null) {
                System.out.println(cliente + "\n");
            }
        }
    }


    public static void repositorioComList(){
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
