package estudo.files;

import java.io.*;

public class ManipulaçãoArquivo {
    public static void main(String[] args) throws IOException {
        ManipulaçãoArquivo criadorArquivo = new ManipulaçãoArquivo();
        criadorArquivo.criarArquivo();
        criadorArquivo.lerArquivoTexto();


    }

    public void lerArquivoTexto(){
        try{
            File arquivo = new File("C:\\Users\\07008374267\\Desktop\\estudo_algoritmo\\Arquivo.txt");
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader reader = new BufferedReader(fileReader);

            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }


            reader.close();

        } catch (IOException e){
            System.out.println("Erro ao ler arquivo");
        }
    }

    public void deletarArquivo() {
        File arquivo = new File("C:\\Users\\07008374267\\Desktop\\estudo_algoritmo\\Arquivo.txt");
        arquivo.delete();

    }

    public void criarPasta(){
        File file = new File("C:\\Users\\07008374267\\Desktop\\estudo_algoritmo\\Pasta");
        boolean criou =  file.mkdir();
        System.out.println(criou);
    }

    public void lerArquivo(){
        File arquivo = new File("C:\\Users\\07008374267\\Desktop\\estudo_algoritmo\\Arquivo.txt");
        System.out.println(arquivo.getAbsoluteFile());
        System.out.println(arquivo.getName());
        System.out.println(arquivo.length()); //retorna os byte
        System.out.println(arquivo.isFile());
    }

    public void criarArquivo() throws IOException {
        try {
            File arquivo = new File("C:\\Users\\07008374267\\Desktop\\estudo_algoritmo\\Arquivo.txt"); //caminho do arquivo quando salvo

            FileWriter fileWriter = new FileWriter(arquivo, true); //onde irei escrever "true" para fazer um append no arquivo ao inves de sobreescrever
            BufferedWriter writer = new BufferedWriter(fileWriter); //escrever

            writer.write("aaaaaaaaaaaaaaaaa"); //metodo para escrever
            writer.flush(); //commita as alterações
            writer.close(); //encerra a estancia

        } catch (IOException e){
            System.out.println("Erro ao criar arquivo" + e.getMessage());
        }
    }
}
