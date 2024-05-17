package projetoListas;

public class Main {
    public static void main(String[] args) {

        ListaLigadas lista = new ListaLigadas();
        //acessar métodos: lista.
        System.out.println(lista);
        lista.adicionaNoComeco("ANDERSON");
        System.out.println(lista);
        lista.adicionaNoComeco("LUAN");
        System.out.println(lista);
        lista.adicionaNoComeco("LORENA");
        System.out.println(lista);
        lista.adiciona("FRANK");
        System.out.println(lista);
        System.out.println("Tamanho:"+lista.tamanho());


    }


}