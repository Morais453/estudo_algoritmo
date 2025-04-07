package estudo.colecoes;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;

import java.util.*;

public class OrganizacaoClientes {
    private Map<TipoSexo, List<Cliente>> mapa;
    public OrganizacaoClientes() {
        this.mapa = new HashMap<>();
    }

    public void adicionaCliente(Cliente cliente) {
        boolean existeSexo = mapa.containsKey(cliente.getSexo());

        if (existeSexo) {
            List<Cliente> clientes = mapa.get(cliente.getSexo());
            clientes.add(cliente);
        } else {
            List<Cliente> clientes = new ArrayList<>();
            clientes.add(cliente);
            mapa.put(cliente.getSexo() , clientes);
        }
    }

    public List<Cliente> buscarClientePorSexo(TipoSexo sexo) {
        return mapa.get(sexo);
    }

    public List<TipoSexo> obterTipos(){
        Set<TipoSexo> tipoSexos = mapa.keySet();
        return new ArrayList<>(tipoSexos);
    }

    public void imprimirClientes(TipoSexo sexo) {
        List<Cliente> clientes = mapa.get(sexo);
        if (clientes != null) {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        } else {
            System.out.println("Lista Vazia");
        }
    }
}
