package tech.ada.controlefluxo;

public class TestePessoa {


    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Rodolfo";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ilessa";

        System.out.println(pessoa.getNome());
        System.out.println(pessoa2.getNome());

    }
}
