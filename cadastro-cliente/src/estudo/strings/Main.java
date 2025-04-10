package estudo.strings;

public class Main {
    static String valor = "Teste string";
    public static void main(String[] args) {
        tamanhoString();
        pegarCaracteres();
        trabalhandoComSubstring();
        exemploIndexOf();
        exemploCase();
        removerEspacoEmBranco();
    }

    private static void tamanhoString(){
        int tamanho = valor.length();
        System.out.println(tamanho);
    }

    private static void pegarCaracteres(){
        char letra = valor.charAt(0/*indice*/); //char == 1 caracter
        System.out.println("Primeiro caracter: " + letra + "\nultimo caracter: " + valor.charAt(valor.length() - 1));
    }

    private static void trabalhandoComSubstring(){
        /*indice inicial e final, cortando o valor do indice final informado ex 1 a 4 pega char de 1 a 3*/
        String pedaco = valor.substring(3 , valor.length());
        System.out.println(pedaco);
    }
    //encntrar o index a partir da string
    private static void exemploIndexOf(){
        int index = valor.indexOf("g");
        System.out.println("Index da letra g: " + index);
    }

    private static void exemploCase(){
        String caixaAlta = valor.toUpperCase();
        System.out.println(caixaAlta);
        String caixaBaixa = valor.toLowerCase();
        System.out.println(caixaBaixa);
    }

    private static void removerEspacoEmBranco(){
        String string = valor.trim().replace(" ",""); //trim remove espaço antes e dps
        System.out.println(string.length());
    }
}
