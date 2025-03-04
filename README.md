# Calculadora Simples em Java

Este é um projeto de uma **calculadora simples** desenvolvida em Java, que realiza as operações matemáticas básicas: **soma**, **subtração**, **multiplicação** e **divisão**. O código foi implementado com base nos conhecimentos iniciais adquiridos em Java, e visa ser uma introdução prática ao uso de estruturas de controle, métodos, entrada de dados e funções em Java.

## Funcionalidades

A calculadora permite ao usuário escolher uma operação entre as seguintes opções:
1. **Soma (➕)**
2. **Subtração (➖)**
3. **Multiplicação (✖️)**
4. **Divisão (➗)**
5. **Sair (❌)**

O programa continuará executando até que o usuário escolha a opção de sair.

## Como Funciona

- O programa exibe um menu com as opções de operações disponíveis.
- O usuário escolhe a operação desejada inserindo o número correspondente.
- O usuário então insere dois valores numéricos (que podem ser inteiros ou decimais).
- O resultado da operação é mostrado na tela.
- Caso o usuário escolha a opção "5", o programa se encerra.

## Estrutura do Código

O código é dividido em uma classe chamada `calculadora` com o seguinte comportamento:

1. **Menu de operações**: Exibe as opções de operação para o usuário e captura a escolha.
2. **Entrada de dados**: Pede ao usuário para inserir dois valores numéricos.
3. **Operações matemáticas**: Realiza a operação correspondente à escolha do usuário utilizando métodos auxiliares (`soma`, `subtracao`, `multiplicacao`, `divisao`).
4. **Controle de fluxo**: O programa continua a solicitar operações até que o usuário escolha a opção de sair.
