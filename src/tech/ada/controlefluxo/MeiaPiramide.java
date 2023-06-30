package tech.ada.controlefluxo;

public class MeiaPiramide {

    public static void main(String[] args) {

        int n = 3;

        for(int i = 0; i < n; i++) {

            for(int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
