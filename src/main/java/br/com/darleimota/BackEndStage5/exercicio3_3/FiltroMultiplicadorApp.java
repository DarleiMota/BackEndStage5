/*
3 - Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique
cada um por 2 e colete os resultados em uma nova lista.
 */


package br.com.darleimota.BackEndStage5.exercicio3_3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@Component
public class FiltroMultiplicadorApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\nLista sem mudanças: "+ numeros);

        List<Integer> impares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Numeros impares: " + impares);

        List<Integer> multiplicados = impares.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Numeros impares multiplicaos por 2: " + multiplicados);
    }
}
