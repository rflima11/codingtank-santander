public class OlaSantander {

    public static void main(String[] args) {

        //TIPOS PRIMITIVOS
        /*
        byte -128 a 127,
        short -32.768 a 32.767,
        int -2.147.483.648 a 2.147.483.647,
        long  -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        float +- 3.40282347E+38F
        double +- 1.797691313486231570E+308
        */

        byte b1 = 127;
        short s1 = 32767;
        int idade = 2147483647;
        long l1 = 321316756756L;
        float f1 = 15.4f;
        double d1 = 32132.5;
        char c1 = 'C';
        boolean boolean1 = true;//true
        boolean boolean2 = false;//false

        Byte byteWrapper = 127;
        Short s1Wrapper = 32767;
        Integer idadeWrapper = 2147483647;
        Long l1Wrapper = 321316756756L;
        Float f1Wrapper = 15.4f;
        Double d1Wrapper = 32132.5;
        Character c1Wrapper = 'C';
        Boolean boolean1Wrapper = true;//true
        Boolean booleanWrapper = false;

        int a1 = 10;
        int a2 = 10;
        // + - * / %
        System.out.println("A soma de de A1 e A2 " + (a1 % a2));

        String string1 = "Hello World";

    final String MINHA_PRIMEIRA_CONSTANTE = "minha primeira constante";

    System.out.println(MINHA_PRIMEIRA_CONSTANTE);

    }

}
