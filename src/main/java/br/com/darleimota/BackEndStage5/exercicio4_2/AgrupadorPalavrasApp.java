/*
2 -Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho. No código a seguir,
há um exemplo prático do resultado esperado.
 */

package br.com.darleimota.BackEndStage5.exercicio4_2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//@Component
public class AgrupadorPalavrasApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> agrupado = palavras.stream()
                        .collect(Collectors.groupingBy(p -> p.length() ));
        System.out.println("Agrupamento de palvras por quantidade de string: ");
        System.out.println(agrupado);

    }
}