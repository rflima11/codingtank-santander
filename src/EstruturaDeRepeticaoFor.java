public class EstruturaDeRepeticaoFor {

    public static void main(String[] args) {

        //for while do while

//        for(int i = 0; i <= 10; i++) {
//            System.out.println("Contador: " + i);
//            for(int b = 0; b < 10; b++) {
//                System.out.println("Contador B: " + b);
//                if (b == 5) {
//                    break;
//                }
//            }
//        }

//        int contador = 0;
//        while(contador < 10) {
//            System.out.println("Contador: " + contador);
//            if (contador == 5) {
//                continue;
//            }
//            contador++;
//            if (contador == 99999)
//                break;
//        }

        int contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador++;
            System.out.println("Executando o DO por que eu sempre executo pelo menos 1 vez");
        } while (contador > 10);

    }
}
