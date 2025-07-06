package br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.exercicios;

import br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.model.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio9CalcularTotalCategoria {

    //9 - Dada a lista de produtos acima, calcule o total dos preços dos
    // produtos em cada categoria e armazene o resultado em um Map<String, Double>.

    public Map<String , Double> totalCategoria (List<Produto> produto){
        return produto.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria ,
                        Collectors.summingDouble(Produto::getPreco)));
    }
    // Agrupando por categoria e somando todos os valores de cada categoria
}
