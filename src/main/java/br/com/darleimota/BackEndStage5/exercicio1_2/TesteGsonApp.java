/*
2 - Suponha que decidimos mudar de ideia e utilizar novamente a biblioteca Gson no nosso projeto ScreenMatch.
Agora que estamos trabalhando com o Maven, os passos para adicionar a biblioteca
são diferentes do que já foi feito antes. Explique quais passos você iria realizar
nesse caso.
*/
package br.com.darleimota.BackEndStage5.exercicio1_2;

import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class TesteGsonApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa("Darlei", 30);

        Gson gson = new Gson();
        String json = gson.toJson(pessoa);

        System.out.println("Objeto serializado: " + json);

        Pessoa convertida = gson.fromJson(json, Pessoa.class);
        System.out.println("Objeto desserializado: " + convertida);
    }
}