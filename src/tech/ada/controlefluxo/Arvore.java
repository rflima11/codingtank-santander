package tech.ada.controlefluxo;

import java.util.Scanner;

public class Arvore {

    public static void main(String[] args) {



        /*

            *
           ***
          *****


         */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <= n; i++) {

            //espaços em branco
            for(int b = 1; b <= n - i; b++) {
                System.out.print(" ");
            }

            //asteriscos
            for(int c = 1; c <= 2 * i - 1; c++){
                System.out.print("*");
            }

            System.out.println("");


        }
    }
}
