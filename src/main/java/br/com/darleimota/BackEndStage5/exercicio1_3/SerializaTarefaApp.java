package br.com.darleimota.BackEndStage5.exercicio1_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class SerializaTarefaApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Tarefa tarefa = new Tarefa("Estudando Jackson", false,"Darlei");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(tarefa);

        System.out.println("Tarefa foi serializado: ");
        System.out.println(json);

    }
}
