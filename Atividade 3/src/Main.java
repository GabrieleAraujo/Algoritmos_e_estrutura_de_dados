/**
 * Exercício de Lista Encadeada
 * Criado por Gabriele Araújo (GitHub:GabrieleAraujo)
 * Data: [11/06/2024]
 * Disciplina: ALGORITMOS E ESTRUTURAS DE DADOS
 */

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Inserir valores a lista
        lista.adicionar(3);
        lista.adicionar(5);
        lista.adicionar(7);

        System.out.println("Lista original:");
        lista.imprimirLista();

        // Novo valor após valor específico (valor da lista, valor a ser inserido)
        lista.inserirApos(7, 4);
        System.out.println("Lista após inserir 4 depois de 7:");
        lista.imprimirLista();

        lista.inserirApos(8, 6);  // Testa inserção após um valor que não existe na lista
    }
}