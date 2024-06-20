package projetoarvore;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria<Objeto> dadosArvore = new ArvoreBinaria<>();


        dadosArvore.inserir(new Objeto(6));
        dadosArvore.inserir(new Objeto(2));
        dadosArvore.inserir(new Objeto(1));
        dadosArvore.inserir(new Objeto(4));
        dadosArvore.inserir(new Objeto(3));
        dadosArvore.inserir(new Objeto(8));

        dadosArvore.exibirInOrdem();
        dadosArvore.exibirPreOrdem();
        dadosArvore.exibirPosOrdem();

        // Teste de remoção
        System.out.println("\nRemovendo o nó com valor 4");
        dadosArvore.remover(new Objeto(4));
        dadosArvore.exibirInOrdem();

    }
}

