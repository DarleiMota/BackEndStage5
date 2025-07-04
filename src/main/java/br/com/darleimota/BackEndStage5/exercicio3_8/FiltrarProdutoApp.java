/*
8 - Tomando o mesmo código do exercício anterior como base, modifique o código para que a
 saída mostre apenas os três produtos mais baratos da categoria "Eletrônicos".
 */
package br.com.darleimota.BackEndStage5.exercicio3_8;

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
                .limit(3)   // solução do exercicio 8 limitando a somente 3 mais baratos
                .collect(Collectors.toList());
        System.out.println(eletronicos);
    }
}