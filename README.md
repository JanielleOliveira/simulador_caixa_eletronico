# SIMULADOR DE CAIXA ELETRÔNICO

  Projeto simples para iniciantes em java que ajudará a praticar os conceitos de entrada/saída, controle de fluxo
 e manipulação de dados sem a necessidade de mergulhar imediatamente na programação orientada a objetos.
 Envolverá a manipulação de contas bancárias saques, depósitos e consultas de saldo, construído usando conceitos
 básicos de programação estruturada em Java.


## Requisitos do Projeto

- Cadastro de Contas: O sistema deve permitir aos usuários cadastrar contas bancárias com informações como número da conta, nome do titular e saldo inicial.
- Operações Bancárias: O sistema deve possibilitar a realização de operações bancárias básicas, incluindo depósito, saque e consulta de saldo.

- Realizar Depósito:
Os usuários podem fazer depósitos em suas contas.  
O sistema atualiza o saldo da conta após o depósito.

- Consultar Saldo:
Os usuários podem consultar o saldo de suas contas.

- Realizar Saque:
Os usuários podem fazer saques de suas contas, desde que haja saldo suficiente.
O sistema atualiza o saldo após o saque.

- Salvar Dados:
O sistema deve ser capaz de salvar os dados das contas em um arquivo de texto "NomeDoArquivo.txt" para persistência.

- Deletar Conta: O sistema deve permitir deletar conta e aceitar como entrada o número da conta a ser excluída e atualizar de acordo.

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
- Intellij IDEA: Ambiente de desenvolvimento integrado (IDE) para codificação e depuração.
- Estruturas de Controle: while, switch, if
- Estruturas de Dados: Arrays são usados para armazenar informações das contas.
- Manipulação de Arquivos (File I/O = E/S de arquivo): Usado para salvar e carregar dados das contas em um arquivo de texto.
