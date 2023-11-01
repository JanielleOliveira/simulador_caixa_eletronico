# SIMULADOR DE CAIXA ELETRÔNICO

  Projeto simples para iniciantes em java que ajudará a praticar os conceitos de entrada/saída, controle de fluxo
 e manipulação de dados sem a necessidade de mergulhar imediatamente na programação orientada a objetos.
 Envolverá a manipulação de contas bancárias saques, depósitos e consultas de saldo, construído usando conceitos
 básicos de programação estruturada em Java.


## Requisitos do Projeto

- Cadastro de Contas: O sistema deve permitir aos usuários cadastrar contas bancárias com informações como número da conta, nome do titular e saldo inicial.
- Operações Bancárias: O sistema deve possibilitar a realização de operações bancárias básicas, incluindo depósito, saque e consulta de saldo.
- Menu Interativo: O sistema deve ter um menu interativo que permite aos usuários escolher entre as operações disponíveis.
- Exibição de Saldo: Após cada operação, o sistema deve mostrar o saldo atual da conta para o usuário.
- Encerramento do Programa: O sistema deve fornecer a opção de encerrar o programa ou permitir que os usuários realizem mais operações.
- Armazenamento de Dados: O sistema deve ser capaz de armazenar informações das contas em um arquivo de texto para preservar os dados entre as execuções.

## Atributos 

- numerosContas: Um array que armazena os números das contas bancárias.
- nomesTitulares: Um array que armazena os nomes dos titulares das contas bancárias.
- saldos: Um array que armazena os saldos das contas bancárias.

  ## Regras de Negócio

  - O saldo de uma conta deve ser atualizado corretamente após cada depósito ou saque.
  - O sistema deve validar se o saldo é suficiente antes de permitir um saque.
 
 ## Tecnologias Utilizadas:

- Linguagem de Programação: Java
- Intellij IDEA
- Estruturas de Controle: while, switch, if
- Entrada e Saída (E/S) de Dados: Scanner para entrada de dados do usuário e operações com arquivos para ler e gravar em um arquivo de texto.
