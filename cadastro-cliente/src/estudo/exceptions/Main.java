package estudo.exceptions;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;

public class Main {
    public static void main(String[] args) {

        try{
            Cliente cliente = new Cliente("Junin","00000", TipoSexo.F);
            String descricao = cliente.getSexo().getDescricao();
            System.out.println(descricao);
        } catch (NullPointerException e) {
            System.out.println("Tipo sexo nulo");
        } catch (Exception e){
            System.out.println("Ocorreu um erro");
        }
    }
}
