import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Pedir ao usuário para inserir dois valores
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // Pedir ao usuário para escolher a operação
            System.out.println("Escolha a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            double resultado;

            // Realizar a operação com base na escolha do usuário
            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    continue;
            }

            // Exibir o resultado
            System.out.println("O resultado é: " + resultado);

            // Perguntar ao usuário se deseja continuar
            System.out.println("Deseja realizar outra operação? (s/n): ");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
            }
        }

        System.out.println("Encerrando a calculadora.");
        scanner.close();
    }
}
