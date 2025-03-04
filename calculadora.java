package projetos;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("          Bem-vindo à Calculadora!  ");
        System.out.println("=====================================");

        int operacaoDesejada = 0;

        do {
            // menu de operações
            System.out.println("\nEscolha uma operação:");

            System.out.println("1. ➕ Soma");
            System.out.println("2. ➖ Subtração");
            System.out.println("3. ✖️ Multiplicação");
            System.out.println("4. ➗ Divisão");
            System.out.println("5. ❌ Sair");

            System.out.print("\nDigite o número da operação desejada: ");
            operacaoDesejada = sc.nextInt();

            if (operacaoDesejada == 5){
                System.out.println("Saindo...");
                System.exit(0);
            }

            // valor a ser calculado
            System.out.println("\nInforme dois valores para calcular:");

            System.out.print("Primeiro valor: ");
            double valor1 = sc.nextDouble();

            System.out.print("Segundo valor: ");
            double valor2 = sc.nextDouble();

            switch (operacaoDesejada){
                case 1:
                    System.out.println("Resultado da Soma: " + soma(valor1, valor2));
                    break;
                case 2:
                    System.out.println("Resultado da Subtração: " + subtracao(valor1, valor2));
                    break;
                case 3:
                    System.out.println("Resultado da Multiplicação: " + multiplicacao(valor1, valor2));
                    break;
                case 4:
                    System.out.println("Resultado da Divisão: " + divisao(valor1, valor2));
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, insira um número de 1 a 5.");
            }
        } while (operacaoDesejada != 5);

        sc.close();
    }

    public static double soma(double valor1, double valor2){
        return valor1 + valor2;
    }

    public static double subtracao(double valor1, double valor2){
        return valor1 - valor2;
    }

    public static double multiplicacao(double valor1, double valor2){
        return valor1 * valor2;
    }

    public static double divisao(double valor1, double valor2){
        return valor1 / valor2;
    }
}
