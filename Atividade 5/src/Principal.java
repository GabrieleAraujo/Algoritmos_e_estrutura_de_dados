public class Principal {

    public static void main(String[] args) {
        System.out.println("Teste Lista Simples:");
        testarListaSimples();

        System.out.println("\nTeste Lista Duplamente Encadeada:");
        testarListaDuplamenteEncadeada();

        System.out.println("\nTeste Fila:");
        testarFila();

        System.out.println("\nTeste Pilha:");
        testarPilha();
    }

    private static void testarListaSimples() {
        Lista listaSimples = new Lista("Ana");
        listaSimples.setProximo(new Lista("Bruno"));
        listaSimples.getProximo().setProximo(new Lista("Carlos"));

        Lista atual = listaSimples;
        while (atual != null) {
            System.out.println(atual.getElemento());
            atual = atual.getProximo();
        }
    }

    private static void testarListaDuplamenteEncadeada() {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        lista.adiciona("Ana");
        lista.adiciona("Bruno");
        lista.adiciona("Carlos");

        System.out.println(lista);

        lista.removeDoComeco();
        System.out.println(lista);

        lista.adicionaNoComeco("Diego");
        System.out.println(lista);

        lista.removeDoFim();
        System.out.println(lista);

        lista.adiciona(1, "Eduarda");
        System.out.println(lista);

        System.out.println("Nome 'Bruno' encontrado? " + lista.Localiza("Bruno"));
    }

    private static void testarFila() {
        Fila fila = new Fila();
        System.out.println(fila);

        fila.enfileirar("Ana");
        System.out.println(fila);

        fila.enfileirar("Bruno");
        System.out.println(fila);

        fila.enfileirar("Carlos");
        System.out.println(fila);

        fila.desenfileirar();
        System.out.println(fila);

        fila.desenfileirar();
        System.out.println(fila);

        System.out.println("Fila está vazia? " + fila.vazio());
    }

    private static void testarPilha() {
        Pilha pilha = new Pilha();
        System.out.println(pilha);

        pilha.empilhar("Ana");
        System.out.println(pilha);

        pilha.empilhar("Bruno");
        System.out.println(pilha);

        pilha.empilhar("Carlos");
        System.out.println(pilha);

        pilha.desempilhar();
        System.out.println(pilha);

        pilha.desempilhar();
        System.out.println(pilha);

        System.out.println("Pilha está vazia? " + pilha.vazio());
    }
}
