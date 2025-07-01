/*
6 - Vamos criar objetos genéricos. Imagine que você trabalha em um site que oferece várias coisas:
venda de produtos, serviços de instalação desses produtos e assinatura de alguns itens. Todas essas
coisas têm algo em comum: podem ser avaliadas pelos consumidores. Crie uma classe genérica de Avaliação,
de modo que possamos ter, por exemplo: Avaliacao<Servico>, Avaliacao<Produto> e Avaliacao<Assinatura>.
Essa classe deve ter o item genérico de avaliação, a nota e um comentário sobre a nota.

*/

package br.com.darleimota.BackEndStage5.exercicio1_6.app;

import br.com.darleimota.BackEndStage5.exercicio1_6.model.Assinatura;
import br.com.darleimota.BackEndStage5.exercicio1_6.model.Produto;
import br.com.darleimota.BackEndStage5.exercicio1_6.model.Servico;
import br.com.darleimota.BackEndStage5.exercicio1_6.model.Avaliacao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AvaliacoesApp implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Produto produto = new Produto("Fone Bluetooth");
        Servico servico = new Servico("Instalação de Ar-condicionado");
        Assinatura assinatura = new Assinatura("Plano Premium");

        Avaliacao<Produto> avaliacaoProduto = new Avaliacao<>(produto, 5, "Excelente qualidade!");
        Avaliacao<Servico> avaliacaoServico = new Avaliacao<>(servico, 4, "Serviço rápido e eficaz.");
        Avaliacao<Assinatura> avaliacaoAssinatura = new Avaliacao<>(assinatura, 3, "Bom, mas pode melhorar.");

        System.out.println(avaliacaoProduto);
        System.out.println(avaliacaoServico);
        System.out.println(avaliacaoAssinatura);
    }
}
