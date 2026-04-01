import java.util.Scanner;
public class equação {
    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        a = sc.nextDouble();

        System.out.println("Insira o valor de B: ");
        b = sc.nextDouble();

        System.out.println("Insira o valor de C: ");
        c = sc.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
           System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0){
            System.out.println("Essa é uma equação de primeiro grau.");
            double x = -c / b;
            System.out.println("Raiz: " + x);
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta < 0){
                System.out.println("Essa equação não possui raizes reais.");
            } else if (delta == 0){
                double x = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("Raiz: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("Raiz 1: " + x1);
                System.out.println("Raiz 2: " + x2);
            }
        
        }    
        sc.close();
    }
}