package projetoListas;

public class Main {
    public static void main(String[] args) {

//        ListaLigadas lista = new ListaLigadas();
//        //acessar métodos: lista.
//        System.out.println(lista);
//        lista.adicionaNoComeco("ANDERSON");
//        System.out.println(lista);
//        lista.adicionaNoComeco("LUAN");
//        System.out.println(lista);
//        lista.adicionaNoComeco("LORENA");
//        System.out.println(lista);
//        lista.adiciona("FRANK");
//        System.out.println(lista);
//        System.out.println("Tamanho:"+lista.tamanho());


        Listaligadaduplamente lista = new Listaligadaduplamente();

        System.out.println(lista);
        lista.adicionaNoComeco("ANDERSON");
        System.out.println(lista);
        lista.adicionaNoComeco("LUAN");
        System.out.println(lista);
        lista.adicionaNoComeco("LORENA");
        System.out.println(lista);
        lista.adiciona("FRANK");
        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista);
        lista.removeDoFim();
        System.out.println(lista);
        lista.adicionaNoComeco("ROGERIO");
        System.out.println(lista);
        lista.adiciona(3,"LUIS CARLOS");
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        System.out.println (lista.Localiza("ROGERIO"));
        System.out.println (lista.Localiza("REINALDO"));
        System.out.println(lista);  }



}