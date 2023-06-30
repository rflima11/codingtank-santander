package tech.ada.controlefluxo;

import java.util.Scanner;

public class PraticaArraysMetodo {

    public static void main(String[] args) {
        //receber N nomes
        //formatar esses nomes
        //imprimir na tela
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos nomes deseja informar? ");
        int tamanho = scan.nextInt();

        //GAMBIARRA BR
        scan.nextLine();

        String[] nomes = new String[tamanho];

        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o " + (i + 1) + " nome: " );
            nomes[i] = formatarNome(scan.nextLine());
        }

        for(String nome : nomes) {
            System.out.println(nome);
        }

        scan.close();
    }

    public static String formatarNome(String nome) {
        String[] nomeSeparado = nome.split(" ");
        String nomeFormatado = "";

        for (String nomeS:
             nomeSeparado) {
            nomeFormatado += nomeS.substring(0, 1).toUpperCase() +
                    nomeS.substring(1).toLowerCase() + " ";
        }


        return nomeFormatado;
    }


}
