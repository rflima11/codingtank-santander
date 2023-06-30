import java.util.Scanner;

public class Entradas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe dois números: ");

        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos dois números é: " + soma);

        scan.close();
    }

}

