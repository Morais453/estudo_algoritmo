package com.morais.clientes.utilitario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GerenciadorArquivos {
    public static final String pastaFotos ="C:\\Users\\07008374267\\Desktop\\estudo_algoritmo\\";

    public static void persistirArquivos(String nome, byte[] bytes){
        try{
            Path path = Paths.get(pastaFotos + nome);
            Files.write(path, bytes);
        } catch (IOException e){
            System.out.println("Erro ao persistir arquivos" + e.getMessage());
        }
    }
}
