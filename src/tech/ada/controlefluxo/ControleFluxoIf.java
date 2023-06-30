package tech.ada.controlefluxo;

import java.util.Scanner;

public class ControleFluxoIf {

    public static void main(String[] args) {

        // Salário < 2000
        // tempoDeCasa >= 1
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe o nome do funcionario: ");
        String nome = scan.nextLine();

        System.out.println("Por favor, informe o salário: ");
        double salario = scan.nextDouble();

        System.out.println("Por favor, informe o tempo de casa: ");
        int tempoDeCasa = scan.nextInt();

        // < > <= >= == != sempre vai retornar um valor boolean ou seja 'true' ou 'false'

        boolean isSalarioMenorQueDoisMil = salario < 2000;

        boolean isTempoDeCasaMaiorQueDoisAnos = tempoDeCasa >= 2;

        // operadores lógicos && (and ou e) || (ou | or) ! (NEGAÇÃO)

//        if (isSalarioMenorQueDoisMil && isTempoDeCasaMaiorQueDoisAnos) {
//            System.out.println(nome +  " apto a promoção");
//        } else if (tempoDeCasa >= 1) {
//            System.out.println(nome  + " usuário ainda não está apto, mas está quase lá :)");
//        } else {
//            System.out.println(nome + " não está a promoção");
//        }
//
        // if ternário tem que retornar um valor
        // condicao ? true : false
        String mensagem = isSalarioMenorQueDoisMil
                && isTempoDeCasaMaiorQueDoisAnos ? nome +  " apto a promoção" : nome + " não está a promoção";

        System.out.println(mensagem);

        Calculadora.somar(5, 5);
    }
}
