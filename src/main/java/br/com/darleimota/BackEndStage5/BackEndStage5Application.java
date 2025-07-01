/*
BackEndStage5/
└── src/
    ├── exercicio1_1/  ← Contador com Scanner
    ├── exercicio1_2/  ← Explicação do uso do Gson com Maven
    ├── exercicio1_3/  ← Serialização com Jackson (objeto → JSON)
    ├── exercicio1_4/  ← Serializando para arquivo tarefa.json
    ├── exercicio1_5/  ← Desserializando arquivo JSON → objeto
    ├── exercicio1_6/  ← Classe genérica Avaliação<T>
 */
package br.com.darleimota.BackEndStage5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackEndStage5Application {

	public static void main(String[] args) {
		SpringApplication.run(BackEndStage5Application.class, args);
	}

}
