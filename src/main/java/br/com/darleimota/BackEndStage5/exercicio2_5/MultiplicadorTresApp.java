/*
5 - Implemente uma expressão lambda que recebe uma lista de inteiros e retorna uma nova
lista onde cada número foi multiplicado por 3. Dica: a função replaceAll, das Collections,
recebe uma interface funcional como parâmetro, assim como vimos na função forEach.
 */

package br.com.darleimota.BackEndStage5.exercicio2_5;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//@Component
public class MultiplicadorTresApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("\n==== Multiplicador de Lista ====");
        System.out.println("Digite números inteiros (digite 0 para encerrar):");

        while(true){
            System.out.print("Numero: ");
            int valor = scanner.nextInt();
            if(valor == 0) break;
            numeros.add(valor);
        }

        System.out.println("Lista sem alteração: "+ numeros);

        IMultiplicador multiplicador = valor -> valor * 3;
        numeros.replaceAll(multiplicador::aplicar);

        System.out.println("Lista multiplicado por 3: "+ numeros);

    }
}
