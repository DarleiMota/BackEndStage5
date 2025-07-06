package br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.exercicios;

import br.com.darleimota.BackEndStage5.exercicio4_6_7_8_9.model.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio6AgruparCategoria {

    // 6 - Dada a lista de produtos acima, agrupe-os por categoria
    // em um Map<String, List<Produto>>.

    public Map<String , List<Produto>> filtrarCategoria (List<Produto> produtos){
        return produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));
    }
    // Solução: Metodo para separar numa lista Map de chave categoria e list de produtos.
}
