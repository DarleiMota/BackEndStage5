package br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.runner;

import br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.exercicios.Exercicio6AgruparCategoria;
import br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.exercicios.Exercicio9CalcularTotalCategoria;
import br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.exercicios.Exercicio7ContarProdutosCategoria;
import br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.exercicios.Exercicio8EscolherMaisCaro;
import br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.model.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

//@Component
public class RespotasApp implements CommandLineRunner {

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

        // Exercicio 6
        System.out.println("\nCategorias agrupadas");
        Exercicio6AgruparCategoria agruparCategoria = new Exercicio6AgruparCategoria();
        Map<String, List<Produto>> exercicio6 = agruparCategoria.filtrarCategoria(produtos);
        exercicio6.forEach((categoria, lista) -> {
            System.out.println("Categoria : " + categoria);
            lista.forEach(System.out::println);
            System.out.println();
        });

        // Exercicio 7
        System.out.println("Quantidade de produtos por categoria");
        Exercicio7ContarProdutosCategoria contarProduto = new Exercicio7ContarProdutosCategoria();
        Map<String, Long> exercicio7 = contarProduto.contarProdutos(produtos);
        exercicio7.forEach((categoria, quantidade) ->{
            System.out.println("Categoria " + categoria + "- Quantidade: " + quantidade);
        });

        //Exercicio 8
        System.out.println("\nPor categoria o valor mais alto");
        Exercicio8EscolherMaisCaro maiscaro = new Exercicio8EscolherMaisCaro();
        Map<String, Optional<Produto>> exercicio8 = maiscaro.maiorValor(produtos);
        exercicio8.forEach((categoria,valorOpt)->{
            valorOpt.ifPresent(produto -> {
                System.out.println("Categoria: " + categoria +
                        " - Nome: " + produto.getNome() +
                        " - Preço: " + produto.getPreco());
            });
        });

        //Exercicio 9
        System.out.println("\nValor total por categoria ");
        Exercicio9CalcularTotalCategoria totalCategoria = new Exercicio9CalcularTotalCategoria();
        Map<String , Double> exercicio9 = totalCategoria.totalCategoria(produtos);
        exercicio9.forEach((categoria , valor ) ->{
            System.out.println("Categoria " + categoria + " - Valor: " + valor);
        });
    }
}

