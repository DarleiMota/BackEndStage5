/*
4 - Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de
uma vez) e imprima o resultado.
 */

package br.com.darleimota.BackEndStage5.exercicio3_4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@Component
public class RemoverDuplicatasApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        List<String> palavras = Arrays.asList("maça", "banana", "maça", "laranja", "banana");

        // Faz imprimindo uma palavra por linha sem nova lista.
//        palavras.stream()
//                .distinct()
//                .forEach(System.out::println);

        List<String> palavrasFiltradas = palavras.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(palavrasFiltradas);
    }
}
