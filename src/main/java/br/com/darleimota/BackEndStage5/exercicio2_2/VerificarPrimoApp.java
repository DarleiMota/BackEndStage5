/*
2 - Implemente uma expressão lambda que verifique se um número é primo.
 */

package br.com.darleimota.BackEndStage5.exercicio2_2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
public class VerificarPrimoApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        IPrimo verificador = (n) -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };

        System.out.println("Para saber se é primo digite um numero");
        int n = scanner.nextInt();
        System.out.println(n + " é primo ? " + verificador.confirmarPrimo(n));
    }
}
