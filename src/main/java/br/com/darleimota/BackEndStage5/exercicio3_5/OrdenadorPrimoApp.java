/*
5 - Dada a lista de sublistas de números inteiros abaixo, extraia todos os
números primos em uma única lista e os ordene em ordem crescente.
 */
package br.com.darleimota.BackEndStage5.exercicio3_5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@Component
public class OrdenadorPrimoApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );
        System.out.println("Listas para verificar : " + listaDeNumeros);

        List<Integer> primos = listaDeNumeros.stream()
                .flatMap(List::stream)          //Botando tudo em um unico fluxo lista.
                .filter(n -> OrdenadorPrimoApp.ehPrimo(n)) // Filtrando pra saber se e primo pelo metodo
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Os numeros primos ordenados: " + primos);
    }

    public static boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}