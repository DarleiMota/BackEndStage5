package br.com.darleimota.BackEndStage5.exercicio4_4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SomaDosQuadradosParesApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Pegar o numeros pares, elevar ao quadrado e somar todos em um unico resultado");
        System.out.println("A lista e : " + numeros);

        int soma = numeros.stream()
                .filter(n -> n % 2 == 0)
                .peek(s -> System.out.print(s + " "))
                .map(n -> n * n)
                .peek(System.out::println)
                .reduce(0, Integer::sum);

        System.out.println("O resultado e : " + soma);
    }
}
