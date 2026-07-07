# 📋 Sistema de Cadastro de Clientes em Java

Um sistema simples, prático e interativo via terminal para o gerenciamento de clientes, desenvolvido em Java. Este projeto simula um CRUD (*Create, Read, Update, Delete*) básico utilizando estruturas de controle e coleções dinâmicas.

---

## 🚀 Sobre o Projeto e Desafio Pessoal

Este projeto foi construído inteiramente por mim com o objetivo de fixar conceitos fundamentais de lógica de programação e manipulação de listas em Java.

**O diferencial deste projeto:** Durante todo o desenvolvimento, **não utilizei Inteligência Artificial** para gerar código ou tirar dúvidas. Sempre que me deparei com um erro ou lógica complexa, recorri estritamente a:
* Documentações oficiais do Java;
* Fóruns técnicos (como Stack Overflow);
* Artigos e tutoriais de programação na web.

Essa abordagem me permitiu entender a fundo o funcionamento dos laços de repetição, o comportamento da classe `Scanner` e como manipular o índice de um `ArrayList` de forma segura.

---

## ✨ Funcionalidades

O sistema conta com um menu dinâmico que oferece as seguintes opções:
1. **Cadastrar Cliente:** Permite definir a quantidade e adicionar múltiplos nomes de uma vez no sistema.
2. **Mostrar Clientes Cadastrados:** Exibe a lista completa de clientes com seus respectivos números de identificação (índices).
3. **Editar Cliente:** Permite alterar o nome de um cliente já cadastrado buscando pelo seu número.
4. **Excluir Cliente:** Remove um cliente da lista com base no número informado.
5. **Pesquisar Cliente:** Busca e exibe os dados de um cliente específico pelo seu número.
6. **Retornar / Sair:** Opções para controle do fluxo dos menus e encerramento seguro do programa.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+ (ou superior)
* **Biblioteca Principal:** `java.util.Scanner` (entrada de dados) e `java.util.ArrayList` (armazenamento dinâmico)
* **Paradigma:** Programação Estruturada / Lógica Procedural

---

## 🧠 Aprendizados e Desafios Superados

* **Loops Aninhados e Controle de Fluxo:** Utilização de estruturas `while` aninhadas combinadas com `switch-case` para manter o menu rodando sem travar o terminal.
* **Manipulação de Índices com ArrayList:** Ajuste da lógica de índices (já que o Java inicia a contagem no `0`, mas para o usuário final faz mais sentido começar a digitar a partir do `1`).
* **Gerenciamento do Scanner:** Controle do fluxo de leitura do teclado e fechamento correto do recurso (`teclado.close()`).

---

## 📦 Como Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado na sua máquina.
2. Baixe ou copie o arquivo `Cadastro_Clientes.java`.
3. Abra o terminal na pasta onde o arquivo está salvo e compile o código:
   ```bash
   javac Cadastro_Clientes.java
