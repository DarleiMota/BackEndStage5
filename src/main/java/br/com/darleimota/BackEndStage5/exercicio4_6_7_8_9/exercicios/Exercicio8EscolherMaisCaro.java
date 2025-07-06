package br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.exercicios;

import br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.model.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercicio8EscolherMaisCaro {

    //8 - Dada a lista de produtos acima, encontre o produto mais caro de cada
    // categoria e armazene o resultado em um Map<String, Optional<Produto>>.

    public Map<String, Optional<Produto>> maiorValor(List<Produto> produto) {
        return produto.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.maxBy(
                                Comparator.comparingDouble(Produto::getPreco)
                        )
                ));
    }
    // Comparação dentro de comparação, A primeira separa por grupo de categoria,
    // a segunda separa o maior valor que precisa comparar pra saber que é o maior valor
}
