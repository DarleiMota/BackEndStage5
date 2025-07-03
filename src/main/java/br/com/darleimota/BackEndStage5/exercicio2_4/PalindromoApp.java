/*
4 - Crie uma expressão lambda que verifique se uma string é um palíndromo. A expressão deve ser
implementada dentro de uma interface funcional com o método boolean verificarPalindromo(String str).
Dica: utilize o método reverse da classe StringBuilder
 */

package br.com.darleimota.BackEndStage5.exercicio2_4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;


//@Component
public class PalindromoApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n==== Verificação de Palíndromo ====");
        System.out.println("Palíndromo: palavra ou frase que lida de trás pra frente é igual.");
        System.out.print("Digite uma palavra para verificar: ");
        String texto = scanner.nextLine();

        IVerificarPalindromo confirmar = t ->
                t.equalsIgnoreCase(new StringBuilder(t).reverse().toString());

        boolean resultado = confirmar.analizar(texto);
        System.out.println("É palíndromo? " + resultado);
    }
}
