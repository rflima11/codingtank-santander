public class Matrize {


    public static void main(String[] args) {

        int idade = 15;

        //[0][1][2]
        int[] idades = new int[3];


        int[][] arrayMultidimensional = new int[3][3];

        arrayMultidimensional[0][0] = 10;
        arrayMultidimensional[0][1] = 20;
        arrayMultidimensional[0][2] = 15;

        arrayMultidimensional[1][0] = 22;
        arrayMultidimensional[1][1] = 25;
        arrayMultidimensional[1][2] = 30;

        arrayMultidimensional[2][0] = 40;
        arrayMultidimensional[2][1] = 45;
        arrayMultidimensional[2][2] = 50;
//
//        for(int colunas = 0; colunas < arrayMultidimensional.length; colunas++) {
//            for(int linhas = 0; linhas < arrayMultidimensional[colunas].length; linhas++) {
//                System.out.print(arrayMultidimensional[colunas][linhas] + " ");
//            }
//            System.out.print("\n");
//        }

        for (int[] colunas : arrayMultidimensional) {
            for (int elemento: colunas) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }



        int[][] arrayMultidimensional2 = new int[4][];
        arrayMultidimensional2[0] = new int[4];
        arrayMultidimensional2[1] = new int[3];
        arrayMultidimensional2[2] = new int[2];
        arrayMultidimensional2[3] = new int[1];






    }
}
