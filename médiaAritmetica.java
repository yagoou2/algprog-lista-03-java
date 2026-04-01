import java.util.Scanner;

public class médiaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Insira o primeiro numero: ");
        int numeroUm = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int numeroDois = sc.nextInt();
        System.out.print("Insira o terceiro número: ");
        int numeroTres = sc.nextInt();

        double numeroMaior = Math.max(numeroUm, Math.max(numeroDois, numeroTres));
        double numeroMenor = Math.min(numeroUm, Math.min(numeroDois, numeroTres));

        double media = (numeroUm + numeroDois + numeroTres) / 3.0;

        System.out.println("O maior número é: "+ numeroMaior +"\nO menor número é: "+ numeroMenor +"\nA média aritmética dos números é: "+ media);

        sc.close();
    }
}
