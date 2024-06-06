public class ListaEncadeada {
    Nodo cabeca;

    public ListaEncadeada() {
        this.cabeca = null;
    }

    public void adicionar(int dado) {
        Nodo novoNodo = new Nodo(dado);
        if (cabeca == null) {
            cabeca = novoNodo;
        } else {
            Nodo atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNodo;
        }
    }

    public void inserirApos(int n1, int n2) {
        Nodo atual = cabeca;
        while (atual != null && atual.dado != n1) {
            atual = atual.proximo;
        }
        if (atual != null) {
            Nodo novoNodo = new Nodo(n2);
            novoNodo.proximo = atual.proximo;
            atual.proximo = novoNodo;
        } else {
            System.out.println("Valor " + n1 + " não encontrado na lista.");
        }
    }

    public void imprimirLista() {
        Nodo atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // Adicionando valores à lista
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);

        // Imprimindo a lista
        System.out.print("Lista antes da inserção: ");
        lista.imprimirLista();

        // Inserindo valor após um valor específico
        lista.inserirApos(20, 25);

        // Imprimindo a lista novamente
        System.out.print("Lista após a inserção: ");
        lista.imprimirLista();

        // Tentando inserir após um valor que não existe
        lista.inserirApos(40, 35);
    }
}