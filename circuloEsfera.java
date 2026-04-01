import java.util.Scanner;

public class circuloEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        double raio;
        double pi = 3.141591;

        System.out.println("Insira o código da operação (1, 2 ou 3): ");
        opcao = sc.nextInt();
        
        System.out.println("Digite o raio: ");
        raio = sc.nextDouble();
        
        switch (opcao) {
           case 1:
           System.out.println("Perímetro: " + (2 * pi * raio));
            break;

           case 2:
           System.out.println("Área: " + pi * raio * raio);
           break;

           case 3:
           System.out.println("Volume: " + ((4.0 / 3.0) * pi * Math.pow(raio, 3)));
            break;

           default:
           System.out.println("Erro: código inválido.");
        }
        sc.close();
    }
    
}
