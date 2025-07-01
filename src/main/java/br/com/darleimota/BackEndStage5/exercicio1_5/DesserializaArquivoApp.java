/*
5 - Agora, você fará o oposto da atividade anterior: a desserialização de um arquivo, que é ler os
valores de um arquivo específico e transformar em um objeto. Leia o conteúdo do arquivo tarefa.json,
produzido no exercício anterior, e o transforme em um objeto do tipo Tarefa. Exiba o conteúdo do
objeto na tela.

Fazer o inverso do exercicio 4
- Ler o arquivo tarefa.json
- desserializar o arquivo usando Jackson
- com os dados do arquivo passar pra classe tarefa
- Usando uma POJO ( Plain Old Java Object).
*/
package br.com.darleimota.BackEndStage5.exercicio1_5;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;

//@Component
public class DesserializaArquivoApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        File arquivo = new File("tarefa.json");

        if(!arquivo.exists()){
            System.out.println("Arquivo tarefa.json não foi encontrado");
        }

        ObjectMapper mapper = new ObjectMapper();
        Tarefa tarefa = mapper.readValue(arquivo , Tarefa.class);

        System.out.println("\nArquivo tarefa.json lido, dados passado para classe Tarefa.");
        System.out.println(tarefa);
    }
}
