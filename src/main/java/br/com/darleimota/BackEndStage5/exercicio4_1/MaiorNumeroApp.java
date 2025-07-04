/*
1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.
 */

package br.com.darleimota.BackEndStage5.exercicio4_1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Component
public class MaiorNumeroApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> maior = numeros.stream()
                .max((a,b) -> a.compareTo(b));
                //.max( Comparator.naturalOrder());

        System.out.println("\n==== ENCONTRANDO O MAIOR VALOR ====");

        // * TRATAMENTO usando isPresent, retorna so se tiver
        // maior.ifPresent(m -> System.out.println("Maior valor: " + m))

        // * TRATAMENTO tradicional
        // if (maior.isPresent()){
        //    System.out.println("O maior valor é: "+ maior.get());
        //    } else {
        //    System.out.println("Valor não encontrado!");
        //}

        // * TRATAMENTO com ifPresentOrElse
        maior.ifPresentOrElse(
                m -> System.out.println("Maior Valor é: %d "+ m),
                        () -> System.out.println("Nenhum Valor encontrado!")
        );
    }
}