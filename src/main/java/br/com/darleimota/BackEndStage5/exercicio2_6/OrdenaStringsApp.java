/*
6 - Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética. Dica:
a função sort, das Collections, recebe uma interface funcional como parâmetro, assim como
vimos na função forEach.
*/


package br.com.darleimota.BackEndStage5.exercicio2_6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//@Component
public class OrdenaStringsApp implements CommandLineRunner {

    @Override
    public void run(String... args) {

        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("\n==== Ordenador de Nomes ====");
        System.out.println("Digite nomes (digite 'sair' para encerrar):");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) break;
            nomes.add(nome);
        }

        System.out.println("Lista original: " + nomes);

        // versão maior da ordenação nomes.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        nomes.sort(String::compareToIgnoreCase); // versão lambda
        System.out.println("Ordenado: " + nomes);
    }
}