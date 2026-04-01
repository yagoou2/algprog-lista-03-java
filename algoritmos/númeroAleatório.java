import java.util.Scanner;
import java.util.Random;

public class númeroAleatório {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Insira o primeiro número inteiro: ");
        int numeroUm = sc.nextInt();
        
        System.out.print("Insira o segundo número inteiro: ");
        int numeroDois = sc.nextInt();
        

        int numeroMaior = Math.max(numeroUm, numeroDois);
        int numeroMenor = Math.min(numeroUm, numeroDois);

        int numeroAleatorio = random.nextInt(numeroMenor, numeroMaior);

        if (numeroAleatorio % 2 == 0){
            System.out.println("O número escolhido foi: "+numeroAleatorio+"\nE é um número PAR");
        } else {
            System.out.println("O número escolhido foi: "+numeroAleatorio+"\nE é um número IMPAR");
        }
        sc.close();
    }
}
