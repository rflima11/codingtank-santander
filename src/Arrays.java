public class Arrays {

    public static void main(String[] args) {
        //[0] [1] [2]
        String[] nomes = new String[3];
        String[] nomes2 = {"Rodolfo", "Alex", "Helena", "Monica", "Roberto"};
        String[] nomes3 = new String[]{"", "", ""};
        String nomes4[] = new String[5];
        //nomes[0] = "Rodolfo";
        //nomes[1] = "Alex";
        //nomes[2] = "Helena";

        int[] idades = new int[2];

        boolean[] arrayBooleanos = new boolean[3];
        char[] arrayCharacteres = new char[3];

        for (char c : arrayCharacteres) {
            System.out.println(c);
        }

        for (boolean b:
            arrayBooleanos) {
            System.out.println(b);
        }
//        idades[0] = 15;
//        idades[1] = 18;

//        System.out.println(nomes[3]);

//        for(int i = 0; i < nomes.length; i++) {
//            System.out.println(nomes[i]);
//        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (int idade : idades) {
            System.out.println(idade);
        }

    }

}
