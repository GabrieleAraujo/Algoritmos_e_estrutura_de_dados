public class Main {
    public static void main(String[] args) {
        // Instância da classe ListaEncadeada
        ListaEncadeada lista = new ListaEncadeada();

        // Valores da lista
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(20);
        lista.adicionar(40);

        System.out.print("Lista: ");
        lista.imprimirLista();

        // Analisando a lista com um valor específico
        int valorParaAnalisar = 20;
        System.out.println("\nAnalisando a lista para o valor: " + valorParaAnalisar);
        lista.analisarLista(valorParaAnalisar);
    }
}
