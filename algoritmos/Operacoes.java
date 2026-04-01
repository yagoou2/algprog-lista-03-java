import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Olá, mundo ===");
        System.out.println("Bem-vindo(a) à Calculadora Simples em Java!");
        System.out.println("+ , - , * , / ou ^");
        System.out.println("Digite 'sair' para encerrar o programa.\n");

        while (true) {

            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /, ^ ou sair): ");
            String operacao = scanner.next();

            if (operacao.equalsIgnoreCase("sair")) {
                System.out.println("fim...");
                break;
            }

            if (operacao.equals("+")) {
                System.out.println("Resultado: " + (numero1 + numero2));

            } else if (operacao.equals("-")) {
                System.out.println("Resultado: " + (numero1 - numero2));

            } else if (operacao.equals("*")) {
                System.out.println("Resultado: " + (numero1 * numero2));

            } else if (operacao.equals("/")) {
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }

            } else if (operacao.equals("^")) {
                System.out.println("Resultado: " + Math.pow(numero1, numero2));

            } else {
                System.out.println("Erro: operação inválida!");
            }
        }

        scanner.close();
    }
}
