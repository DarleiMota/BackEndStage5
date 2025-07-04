/*
1 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.
 */

package br.com.darleimota.BackEndStage5.exercicio3_1;

import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;
import java.util.List;


//@Component
public class FiltroNumerosParesApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    };
}