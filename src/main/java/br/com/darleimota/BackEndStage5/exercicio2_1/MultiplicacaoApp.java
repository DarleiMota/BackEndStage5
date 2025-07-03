/*
1 - Crie uma expressão lambda que multiplique dois números inteiros. A expressão deve ser
implementada dentro de uma interface funcional com o método multiplicacao(int a, int b).
 */


package br.com.darleimota.BackEndStage5.exercicio2_1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class MultiplicacaoApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        // Instanciando o metodo da interface e criando o lambda
        IOperacaoMatematica operacao = (x, y ) -> x * y;

        System.out.printf("%d X %d = %d%n", a, b, operacao.multiplicacao(a,b));
    }
}
