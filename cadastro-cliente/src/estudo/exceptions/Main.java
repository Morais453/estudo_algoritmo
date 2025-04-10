package estudo.exceptions;

import com.morais.clientes.dominio.Cliente;
import com.morais.clientes.dominio.enums.TipoSexo;
import com.morais.clientes.logicanegocio.ValidadorCliente;

public class Main {
    public static void main(String[] args) {

        try{
            Cliente cliente = new Cliente("Morais","0000000000", TipoSexo.F);
            ValidadorCliente.Validar(cliente);

        } catch (DadoObrigatorioException e){
            System.out.println(e.getMessage());
        } finally {
            //executa dando erro ou não
            System.out.println("Fim");
        }
    }
}
