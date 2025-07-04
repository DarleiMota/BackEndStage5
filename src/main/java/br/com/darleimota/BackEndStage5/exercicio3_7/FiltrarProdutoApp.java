/*
7 - Você tem uma lista de objetos do tipo Produto, onde cada produto possui os
atributos nome (String), preco (double) e categoria (String). Filtre todos os
produtos da categoria "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo
preço em ordem crescente e colete o resultado em uma nova lista.
 */

package br.com.darleimota.BackEndStage5.exercicio3_7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//@Component
public class FiltrarProdutoApp implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        List<Produto> eletronicos = produtos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos"))
                .filter(p -> p.getPreco() < 1000)
                .sorted(Comparator.comparing(Produto::getPreco))
                .collect(Collectors.toList());
        System.out.println(eletronicos);
    }
}