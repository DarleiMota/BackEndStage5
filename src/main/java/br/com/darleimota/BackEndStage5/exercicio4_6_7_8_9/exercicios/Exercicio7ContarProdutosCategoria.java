package br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.exercicios;

import br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.model.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio7ContarProdutosCategoria {

    //7 - Dada a lista de produtos acima, conte quantos produtos há em
    // cada categoria e armazene em um Map<String, Long>.

    public Map<String, Long> contarProdutos(List<Produto> produto) {
        return produto.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
    }
    // Solução foi separar por grupo categoria e contar cada um por counting.
}
