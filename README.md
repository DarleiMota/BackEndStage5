# 🎯💻 Back-End Stage 5 - Java | Oracle Next Education

&#x20;&#x20;

> *"🔄 Stream, JSON e Orientação a Objetos — dominando estruturas modernas com Java."* 📦

## 🕹️ Sobre o Projeto

Este repositório reúne os desafios desenvolvidos na quinta fase da **Formação Back-End** do programa **Oracle Next Education (ONE)** em parceria com a **Alura**.

Nesta etapa, o foco está na aplicação de **Streams**, **Gson**, **Jackson**, uso de **interfaces**, modelagem orientada a objetos e práticas avançadas com coleções, `Map`, `Set` e `Optional`.

---

## 🗂️ Fase 5 - Estrutura do Projeto

```
📁 BackEndStage5/
├── src/
│  │
│  ├── 📦 exercicio1_1  -> Objeto simples com saída padrão
│  ├── 📦 exercicio1_2  -> Serialização de Pessoa com Gson
│  ├── 📦 exercicio1_3  -> Serialização para arquivo JSON
│  ├── 📦 exercicio1_4  -> Escrita com FileWriter
│  ├── 📦 exercicio1_5  -> Desserialização de Tarefas
│  ├── 📦 exercicio1_6  -> Modelos: Produto, Serviço, Assinatura
│  │
│  ├── 📦 exercicio2_1  -> Interface Operação Matemática
│  ├── 📦 exercicio2_2  -> Implementações com soma/subtração
│  ├── 📦 exercicio2_3  -> Multiplicação/Divisão customizada
│  ├── 📦 exercicio2_4  -> Operações encadeadas
│  ├── 📦 exercicio2_5  -> Refatoração com double
│  ├── 📦 exercicio2_6  -> Uso de Lambdas
│  ├── 📦 exercicio2_7  -> Desafio final matemático
│  │
│  ├── 📦 exercicio3_1 a 3_8  -> Operações com Stream API
│  ├── 📦 exercicio4_1 a 4_5  -> Leitura, gravação e ordenação
│  └── 📦 exercicio4_6_7_8_9  -> Projeto com JSON + Stream + OO
│
└── README.md

📌 Exercícios organizados por tema e prática aplicada.
```

## 🧠 **Conceitos Praticados**

📄 **Manipulação de Arquivos**

- Escrita com FileWriter
- Leitura com BufferedReader

🧾 **Gson e Jackson, JSON**

- Serialização e Desserialização
- Geração de arquivos JSON formatados

🌀 **Interfaces & Polimorfismo**

- Interfaces com métodos abstratos
- Lambdas e programação funcional

🧮 **Streams e Collections**

- filter, map, collect, groupingBy
- Optional, ordenação e particionamento
- Uso de List, Set e Map

🎯 **Boas Práticas**

- Organização por fases
- Separação de responsabilidades
- Modularidade e reuso de código

---

## 🛠️ Como Rodar

1. Clone o repositório:

```bash
git clone https://github.com/DarleiMota/BackEndStage5.git
```

2. Abra em sua IDE Java favorita (IntelliJ IDEA, Eclipse, VSCode...)

3. Navegue até a pasta do exercício desejado.

4. Execute a classe `App` ou `Main` para rodar os testes.

⚠️ Importante: Como há múltiplos exercícios com estruturas independentes, certifique-se de remover a anotação @Component das classes que não estão sendo executadas no momento, evitando conflitos na injeção de dependência do Spring Boot, para manter a estrutura elas foram comentadas

```JAVA
//@Component
public class ContadorApp implements CommandLineRunner {

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
```
💡 Você também pode comentar o @SpringBootApplication ou mover temporariamente as outras classes fora do scan path caso deseje rodar apenas um módulo por vez.


---

## 🧙‍♂️ Desenvolvedor

**Darlei Mota**\
📍 Aprendiz de Código em Jornada Java | ONE - Oracle Next Education\
🔗 [github.com/DarleiMota](https://github.com/DarleiMota)

