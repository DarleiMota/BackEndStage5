/*
3 - Crie uma função lambda que receba uma string e a converta para letras maiúsculas.
 */

package br.com.darleimota.BackEndStage5.exercicio2_3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class ConversorApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        IConversorMaiuscula converterMaiuscula = (texto) -> texto.toUpperCase();

        System.out.println("Digite um texto para conveter para Maiusculo");
        String textoSemAlteracao = scanner.nextLine();
        String textoConvertido = converterMaiuscula.converter(textoSemAlteracao);

        System.out.println("Texto sem alteração: "+ textoSemAlteracao);
        System.out.println("Texto convertido: "+ textoConvertido);
    }
}
