/*
4 - Lembre-se: serializar um objeto é conseguir representá-lo de alguma forma em um arquivo.
Aqui, você deve instanciar um objeto do tipo Tarefa e fazer com que o conteúdo do objeto vá
para o arquivo tarefa.json. Para isso, utilize o Jackson para te auxiliar na tarefa. Observação:
para criar novos arquivos, podemos utilizar new File("tarefa.json").

- Criar arquivo
- Serializar para o arquivo usando Jackson
- Usando uma POJO ( Plain Old Java Object) tarefa
*/

package br.com.darleimota.BackEndStage5.exercicio1_4;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.io.File;

//@Component
public class SerializaParaArquivoApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Tarefa tarefa = new Tarefa("Criação de de arquivos com Jackson",true,"Darlei");
        ObjectMapper mapper = new ObjectMapper();

        // criação do arquivo para armazenar os dados do json
        // Pode ser feito tudo ao mesmo tempo,
        // objectMapper.writeValue(new File("tarefa.json"), tarefa)
        File arquivo = new File("tarefa.json");

        // armazenando os dados do json no arquivo tarefa.json
        mapper.writeValue(arquivo, tarefa);
        System.out.println("Dados gravado no arquivo tarefa.json com sucesso!");
    }
}
