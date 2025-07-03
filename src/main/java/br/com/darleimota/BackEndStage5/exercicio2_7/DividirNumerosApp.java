/*
7 - Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo.
A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.
*/


package br.com.darleimota.BackEndStage5.exercicio2_7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class DividirNumerosApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        IDivisao divisao = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Não é possivel dividir por 0");
            }
            return a / b;
        };

        System.out.println("==== DIVISOR DE NUMEROS ====");
        System.out.println("Digite o primeiro numero para dividir");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero para dividir");
        double numero2 = scanner.nextDouble();

        try {
            double resultado = divisao.divisor(numero1, numero2);
            System.out.println("O resultado é " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro, " + e.getMessage());
        }
    }
}
