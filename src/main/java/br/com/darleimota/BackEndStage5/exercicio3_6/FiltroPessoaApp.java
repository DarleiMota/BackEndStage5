/*
6 - Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18
anos, extraia os nomes e imprima-os em ordem alfabética. A classe Pessoa
está definida abaixo.
 */

package br.com.darleimota.BackEndStage5.exercicio3_6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// @Component
public class FiltroPessoaApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19)
        );

        pessoas.stream()
                .filter(p -> p.getIdade() > 18) // filtrando pela idade
                .map(p -> p.getNome()) // pegando somente o nome
                .sorted() // organizando a lista
                .forEach(System.out::println);
    }
}
