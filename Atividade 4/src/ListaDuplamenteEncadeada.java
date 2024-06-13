/**
 * Exercício de Lista duplamente encadeada
 * Criado por Gabriele Araújo (GitHub:GabrieleAraujo)
 * Data: [11/06/2024]
 * Disciplina: ALGORITMOS E ESTRUTURAS DE DADOS
 */

import java.util.ArrayList;
import java.util.List;

public class ListaDuplamenteEncadeada {
    Nodo cabeca;  // primeiro nodo da lista

    // Adicionar um novo nodo ao final da lista
    public void adicionar(int dado) {
        Nodo newNodo = new Nodo(dado);
        if (cabeca == null) {  // verificar se a lista tá vazia
            cabeca = newNodo;  // novo nodo como a cabeça da lista
        } else {
            Nodo nodoAtual = cabeca;  // buscar pelo final da lista a partir da cabeça
            while (nodoAtual.proximo != null) {  // percorrer a lista até encontrar o último nodo
                nodoAtual = nodoAtual.proximo;
            }
            nodoAtual.proximo = newNodo;  // adicionar o novo nodo ao final da lista
        }
    }

    // Imprimir todos os nodos da lista
    public void imprimirLista() {
        Nodo nodoAtual = cabeca;
        while (nodoAtual != null) {  // percorrer a lista até o final
            System.out.print(nodoAtual.dado + " ");
            nodoAtual = nodoAtual.proximo;
        }
        System.out.println();
    }

    // Analisar a lista
    public void analisarLista(int valor) {
        Nodo nodoAtual = cabeca;
        int totalNodos = 0;
        int nodosIguais = 0;
        int nodosMaiores = 0;
        List<Integer> posicoesIguais = new ArrayList<>();  // guardar posições de nodos com valor igual

        int posicao = 1;  //
        while (nodoAtual != null) {
            totalNodos++;
            if (nodoAtual.dado == valor) {  // verificar se o valor do nodo é igual ao fornecido
                nodosIguais++;
                posicoesIguais.add(posicao);
            } else if (nodoAtual.dado > valor) {  // verifica se o valor do nodo é maior que o passado
                nodosMaiores++;
            }
            nodoAtual = nodoAtual.proximo;
            posicao++;
        }
        System.out.println("Total de nodos: " + totalNodos);
        System.out.println("Nodos iguais ao valor " + valor + ": " + nodosIguais);
        if (!posicoesIguais.isEmpty()) {  // verificar se há posições de nodos iguais
            System.out.print("Posições dos nodos iguais: ");
            for (int p : posicoesIguais) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
        System.out.println("Nodos com valores maiores que " + valor + ": " + nodosMaiores);
    }
}