/**
 * Exercício de Lista duplamente encadeada
 * Criado por Gabriele Araújo (GitHub:GabrieleAraujo)
 * Data: [11/06/2024]
 * Disciplina: ALGORITMOS E ESTRUTURAS DE DADOS
 */

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // Valores
        lista.adicionar(11);
        lista.adicionar(13);
        lista.adicionar(4);
        lista.adicionar(17);
        lista.adicionar(9);
        lista.adicionar(4);

        // lista antes da análise
        System.out.print("Lista: ");
        lista.imprimirLista();

        // Analisando a lista com um valor especificp
        int valorParaAnalisar = 4;
        System.out.println("\nAnalisando a lista para o valor: " + valorParaAnalisar);
        lista.analisarLista(valorParaAnalisar);
    }
}
