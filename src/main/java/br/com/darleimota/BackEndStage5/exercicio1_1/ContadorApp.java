/*
1 - Crie um novo projeto com Spring Boot, usando o site start.spring.io. Esse projeto será
o contador, e funcionará na linha de comando. Você deve pedir para um usuário digitar um
número e depois imprimir na tela uma contagem de 1 até o número digitado pelo usuário.

Por exemplo, se o usuário digitar 5, deve aparecer no terminal 1 2 3 4 5 .
*/
package br.com.darleimota.BackEndStage5.exercicio1_1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class ContadorApp implements CommandLineRunner {

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para contar até ele: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nContagem finalizada!!!");
    }
}
