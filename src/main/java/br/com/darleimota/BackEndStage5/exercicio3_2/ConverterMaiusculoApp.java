/*
2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.
 */

package br.com.darleimota.BackEndStage5.exercicio3_2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//@Component
public class ConverterMaiusculoApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    };
}
