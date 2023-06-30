import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String[] split = input.split(",");

        double[] inputDouble = new double[4];

        for(int i = 0; i < inputDouble.length; i++) {
            inputDouble[i] = Double.parseDouble(split[i]);
        }

        System.out.printf("O total do faturamento do mês: %.2f%n", salarioComComissao(inputDouble));
    }


    public static double salarioComComissao(double[] input) {
        double numeroDeCarrosVendidos = input[0];
        double valorTotalDeVendasNoMes = input[1];
        double salarioFixo = input[2];
        double valorFixoPorCarroVendido = input[3];

        double valorFixoDeCarrosVendidos = numeroDeCarrosVendidos * valorFixoPorCarroVendido;
        double cincoPorCentoSobreOValorTotal = valorTotalDeVendasNoMes * 0.05;


        return valorFixoDeCarrosVendidos + cincoPorCentoSobreOValorTotal + salarioFixo;


    }
}
