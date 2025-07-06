/*
3 - Dada a lista de nomes abaixo, concatene-os separados por vírgula.
No código a seguir, há um exemplo prático do resultado esperado.
 */

package br.com.darleimota.BackEndStage5.exercicio4_3;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//@Component
public class ConcatenandoApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        String agrupamento = nomes.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Lista a ser agrupada: "+ nomes);
        System.out.println("Lista agrupados em uma única string: "+ agrupamento);


    }
}
