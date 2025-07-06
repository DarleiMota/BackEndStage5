package br.com.darleimota.BackEndStage5.exercicio4_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//@Component
public class SeparadorParImpaApp implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(SeparadorParImpaApp.class);

    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("\nSeparando numeros pares e impares");
        System.out.println("Lista à separar: "+ numeros + "\n");

        List<Integer> pares = numeros.stream()
                .filter(p -> p % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Numeros pares: " + pares);

        List<Integer> impares = numeros.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Numeros impares " + impares+ "\n");

        // Outra solução encontrada
        System.out.println("Outra forma de fazer usando partitioningBy");
        Map<Boolean, List<Integer>> resultado = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Usando partitioningBy com map, V = Par, F = Impar \n" + resultado);
    }
}
