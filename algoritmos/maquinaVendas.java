import java.util.Scanner;

public class maquinaVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorCompra, valorPago;

        System.out.println("Máquina de vendas\nQual o valor da compra? ");
        valorCompra = sc.nextInt();
        System.out.println("Qual o valor pago? ");
        valorPago = sc.nextInt();

        if (valorPago != 100 && valorPago != 50 && valorPago != 20 && valorPago != 10 && valorPago != 5 && valorPago != 2 && valorPago != 1){
           System.out.println("Nota invalída\n A máquina aceita apenas notas de\r\n" + //
                              "R$100,00, R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.");
        }
        else if (valorPago < valorCompra){
            System.out.println("Valor insuficiente para a compra.");
        } else {
            int troco = valorPago - valorCompra;
            int trocoOriginal = troco;

            int nota50 = troco / 50;
            troco = troco % 50;

            int nota20 = troco / 20;
            troco = troco % 20;

            int nota10 = troco / 10;
            troco = troco % 10;

            int nota5 = troco / 5;
            troco = troco % 5;

            int nota2 = troco / 2;
            troco = troco % 2;

            int nota1 = troco / 1;
            troco = troco % 1;
            
            System.out.printf("Valor pago: R$%.2f\n", (double) valorPago);
            System.out.printf("Valor da compra: R$%.2f\n", (double) valorCompra);
            System.out.printf("Troco: R$%.2f\n", (double) trocoOriginal);
            System.out.println("Notas de 50: "+ nota50);
            System.out.println("Notas de 20: "+ nota20);
            System.out.println("Notas de 10: "+ nota10);
            System.out.println("Nota de 5: "+ nota5);
            System.out.println("Nota de 2: "+ nota2);
            System.out.println("Nota de 1: "+ nota1);

            sc.close();
        }
    }
}
